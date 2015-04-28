package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import substance.Main;

import Utils.Data;
import Utils.Utils;

@SuppressWarnings("serial")
public class DialogGroup extends JDialog {

	public DialogGroup(JFrame parent) {
		super(parent, true);// FIXME

		init("");

		this.setLocationRelativeTo(parent);
	}

	public DialogGroup(JFrame parent, String s) {
		super(parent, true);

		init(s);

		this.setLocationRelativeTo(parent);
	}

	private void init(String s) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setResizable(false);

		final int SIZE = Data.SIZE;
		final short S_MAX = Data.S_MAX;
		final byte GAP = (byte) (Data.GAP / 2);
		final LayoutStyle.ComponentPlacement UNRELATED = LayoutStyle.ComponentPlacement.UNRELATED;
		final LayoutStyle.ComponentPlacement RELATED = LayoutStyle.ComponentPlacement.RELATED;
		final GroupLayout.Alignment BASELINE = GroupLayout.Alignment.BASELINE;
		final GroupLayout.Alignment LEADING = GroupLayout.Alignment.LEADING;
		final int P_SIZE = GroupLayout.PREFERRED_SIZE;

		tfGrInput = new HintTextField(s.isEmpty() ? Data.TF_GROUPS : s);
		buttGrOk = new JButton();
		buttGrCancel = new JButton();
		addActionListeners();

		JLabel labGrInfo = new JLabel();
		JLabel labComm = new JLabel();
		labGrInfo.setText(Data.LBL_GROUPS);
		labComm.setText(Data.LBL_GROUP_COMM);

		tfGrInput.setFont(Utils.FONT);
		labGrInfo.setFont(Utils.FONT);
		tfGrInput.setHorizontalAlignment(0);
		labGrInfo.setHorizontalAlignment(0);
		labComm.setHorizontalAlignment(0);

		setText();

		GroupLayout jPanel1Layout = new GroupLayout(getContentPane());

		this.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								jPanel1Layout
										.createParallelGroup(LEADING)
										.addComponent(labGrInfo, P_SIZE, SIZE / 2, S_MAX)
										.addComponent(tfGrInput)
										.addGroup(
												jPanel1Layout.createSequentialGroup().addComponent(buttGrCancel)
														.addPreferredGap(RELATED, P_SIZE, S_MAX)
														.addComponent(buttGrOk, P_SIZE, SIZE / 12, P_SIZE))
										.addComponent(labComm, P_SIZE, P_SIZE, S_MAX)).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(LEADING)
				.addGroup(
						jPanel1Layout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(labGrInfo)
								.addPreferredGap(RELATED, P_SIZE, S_MAX)
								.addComponent(labComm)
								.addPreferredGap(UNRELATED)
								.addComponent(tfGrInput, P_SIZE, P_SIZE, P_SIZE)
								.addPreferredGap(UNRELATED)
								.addGroup(
										jPanel1Layout.createParallelGroup(BASELINE).addComponent(buttGrOk)
												.addComponent(buttGrCancel)).addGap(GAP, GAP, GAP)));

		pack();
	}

	private void addActionListeners() {
		buttGrOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				Main.getInstance().addGroup(getAll());
			}
		});
		buttGrCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {

			}
		});
	}

	private String getAll() {
		return tfGrInput.getText();
	}

	private void setText() {
		buttGrOk.setText(Data.BTN_OK);
		buttGrCancel.setText(Data.BTN_CANCEL);
	}

	private JButton buttGrCancel;
	private JButton buttGrOk;
	private HintTextField tfGrInput;
}