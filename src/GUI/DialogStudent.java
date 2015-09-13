package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.*;
import javax.swing.JFormattedTextField.AbstractFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import com.google.common.base.Joiner;


import Utils.Data;
import Utils.Utils;

@SuppressWarnings({ "serial" })
public class DialogStudent extends JDialog {

	public DialogStudent(JFrame parent) {
		super(parent, true); // FIXME
		initComponents();
		this.setLocationRelativeTo(parent);
	}

	private JButton buttGrCancel;
	private JButton buttGrOk;
	HintTextField tfName;
	HintTextField tfSecName;
	HintTextField tfLastName;
	HintTextField tfGroup;
	UtilDateModel model;

	private void initComponents() {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

		final int SIZE = Data.SIZE;
		final short S_MAX = Data.S_MAX;
		final byte GAP = Data.GAP;
		final LayoutStyle.ComponentPlacement RELATED = LayoutStyle.ComponentPlacement.RELATED;
		final GroupLayout.Alignment LEADING = GroupLayout.Alignment.LEADING;
		final GroupLayout.Alignment TRAILING = GroupLayout.Alignment.TRAILING;
		final GroupLayout.Alignment BASELINE = GroupLayout.Alignment.BASELINE;
		final int P_SIZE = GroupLayout.PREFERRED_SIZE;
		final int D_SIZE = GroupLayout.DEFAULT_SIZE;

		JLabel jLabel1 = new JLabel();
		tfName = new HintTextField("Введите имя");
		tfSecName = new HintTextField("Введите фамилию");
		tfLastName = new HintTextField("Введите отчество");
		tfGroup = new HintTextField("Введите код группы");

		model = new UtilDateModel();
		JDatePanelImpl datePanel;
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setToolTipText("Месяц начинается с 0,\nНажмите ...");

		jLabel1.setFont(Utils.FONT);
		jLabel1.setHorizontalAlignment(0);
		jLabel1.setText("Анкета студента");
		buttGrOk = new JButton();
		buttGrOk.setText(Data.BTN_OK);
		buttGrCancel = new JButton();
		buttGrCancel.setText(Data.BTN_CANCEL);
		addActionListeners();
		// buttGrOk.requestFocus();
		// buttGrOk.grabFocus();

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(LEADING)
				.addGroup(
						TRAILING,
						layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, D_SIZE, SIZE / 2, S_MAX)
								.addContainerGap())
				.addGroup(
						layout.createParallelGroup(LEADING).addGroup(
								layout.createSequentialGroup()
										.addGap(GAP, GAP, GAP)
										.addGroup(
												layout.createParallelGroup(LEADING)
														.addGroup(
																layout.createSequentialGroup().addComponent(buttGrCancel)
																		.addPreferredGap(RELATED, P_SIZE, S_MAX)
																		.addComponent(buttGrOk, P_SIZE, SIZE / 12, P_SIZE))
														.addComponent(tfName, D_SIZE, SIZE / 2, S_MAX).addComponent(tfSecName)
														.addComponent(tfLastName).addComponent(datePicker)
														.addComponent(tfGroup)).addGap(GAP, GAP, GAP))));
		layout.setVerticalGroup(layout
				.createParallelGroup(LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1))
				.addGroup(
						layout.createParallelGroup(LEADING).addGroup(
								layout.createSequentialGroup()
										.addGap(GAP, GAP, GAP)
										.addComponent(tfName, P_SIZE, D_SIZE, P_SIZE)
										.addPreferredGap(RELATED)
										.addComponent(tfSecName, P_SIZE, D_SIZE, P_SIZE)
										.addPreferredGap(RELATED)
										.addComponent(tfLastName, P_SIZE, D_SIZE, P_SIZE)
										.addPreferredGap(RELATED)
										.addComponent(datePicker, P_SIZE, D_SIZE, P_SIZE)
										.addPreferredGap(RELATED)
										.addComponent(tfGroup, P_SIZE, D_SIZE, P_SIZE)
										.addPreferredGap(RELATED)
										.addGroup(
												layout.createParallelGroup(BASELINE).addComponent(buttGrOk)
														.addComponent(buttGrCancel)).addPreferredGap(RELATED)
										.addGap(GAP, GAP, GAP))));

		pack();
	}

	private void addActionListeners() {
		buttGrOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
			//	Main.getInstance().addStudent(getAll());
				DialogStudent.this.dispose();
			}
		});
		buttGrCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				DialogStudent.this.dispose();
			}
		});
	}

	protected String getAll() {
		return Joiner.on('&').join(tfName.getText(), tfSecName.getText(), tfLastName.getText(), getValue(), tfGroup.getText());
	}

	private String getValue() {
		int year = model.getYear();
		int month = model.getMonth() + 1;
		int day = model.getDay();
		return day + "." + month + "." + year;
	}

	public class DateLabelFormatter extends AbstractFormatter {
		private String datePattern = "dd.mm.yyyy";
		private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

		@Override
		public Object stringToValue(String text) throws ParseException {
			return dateFormatter.parseObject(text);
		}

		@Override
		public String valueToString(Object value) throws ParseException {
			if (value != null) {
				Calendar cal = (Calendar) value;
				// int year = cal.get(Calendar.YEAR);
				// int month = cal.get(Calendar.MONTH) + 1;
				// int day = cal.get(Calendar.DAY_OF_MONTH);
				return dateFormatter.format(cal.getTime());
			}
			return "";
		}
	}
}