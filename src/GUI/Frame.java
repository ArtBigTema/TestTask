package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Utils.Data;
import Utils.Utils;

@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
public class Frame extends JFrame {

	public Frame() {
		init();
	}

	private void init() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		final short S_MAX = Data.S_MAX;
		final byte GAP = Data.GAP;
		final LayoutStyle.ComponentPlacement UNRELATED = LayoutStyle.ComponentPlacement.UNRELATED;
		final LayoutStyle.ComponentPlacement RELATED = LayoutStyle.ComponentPlacement.RELATED;
		final GroupLayout.Alignment TRAILING = GroupLayout.Alignment.TRAILING;
		final GroupLayout.Alignment BASELINE = GroupLayout.Alignment.BASELINE;
		final GroupLayout.Alignment LEADING = GroupLayout.Alignment.LEADING;
		final int P_SIZE = GroupLayout.PREFERRED_SIZE;
		final int D_SIZE = GroupLayout.DEFAULT_SIZE;
		final int SIZE = Data.SIZE;

		JPanel jPanel2 = new JPanel();
		JPanel jPanel5 = new JPanel();
		JPanel jPanel4 = new JPanel();
		JPanel jPanel3 = new JPanel();
		JPanel jPanel6 = new JPanel();
		JPanel jPanel7 = new JPanel();
		JPanel jPanel1 = new JPanel();
		JScrollPane scrollPaneStudent = new JScrollPane();
		JScrollPane skrollPaneGroup = new JScrollPane();

		constructor();

		initTables();

		setTextForComponents();

		skrollPaneGroup.setViewportView(tableGroup);
		GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(LEADING).addComponent(skrollPaneGroup));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(LEADING).addComponent(skrollPaneGroup, TRAILING,
				D_SIZE, SIZE / 2, S_MAX));

		// buttGrDelet.setMaximumSize(new java.awt.Dimension(51, 23));
		// buttGrDelet.setMinimumSize(new java.awt.Dimension(51, 23));

		GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(buttGrAdd, P_SIZE, P_SIZE, P_SIZE)
						.addGap(GAP, GAP, GAP).addComponent(buttGrChange, D_SIZE, P_SIZE, S_MAX).addGap(GAP, GAP, GAP)
						.addComponent(buttGrDelete, P_SIZE, D_SIZE, P_SIZE).addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(LEADING).addGroup(
				jPanel4Layout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								jPanel4Layout.createParallelGroup(BASELINE).addComponent(buttGrAdd).addComponent(buttGrChange)
										.addComponent(buttGrDelete, P_SIZE, D_SIZE, P_SIZE)).addContainerGap(D_SIZE, S_MAX)));

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(LEADING)
				.addComponent(jPanel4, D_SIZE, D_SIZE, S_MAX).addComponent(jPanel5, D_SIZE, D_SIZE, S_MAX));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addComponent(jPanel5, D_SIZE, D_SIZE, S_MAX).addPreferredGap(RELATED)
						.addComponent(jPanel4, P_SIZE, D_SIZE, P_SIZE)));

		GroupLayout tabGroupLayout = new GroupLayout(tabGroup);
		tabGroup.setLayout(tabGroupLayout);
		tabGroupLayout.setHorizontalGroup(tabGroupLayout.createParallelGroup(LEADING).addComponent(jPanel2, TRAILING, D_SIZE,
				D_SIZE, S_MAX));
		tabGroupLayout.setVerticalGroup(tabGroupLayout.createParallelGroup(LEADING)
				.addComponent(jPanel2, D_SIZE, D_SIZE, S_MAX));

		tabAll.addTab(Data.TAB_GROUPS, null, tabGroup, Data.TOOLTIP_TAB_GROUPS);

		GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout
				.createParallelGroup(LEADING)
				.addComponent(scrollPaneStudent, D_SIZE, SIZE, S_MAX)
				.addGroup(
						jPanel6Layout.createSequentialGroup().addContainerGap().addComponent(toggleSort, D_SIZE, D_SIZE, S_MAX)
								.addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(LEADING).addGroup(
				TRAILING,
				jPanel6Layout.createSequentialGroup().addGap(GAP, GAP, GAP).addComponent(toggleSort).addPreferredGap(UNRELATED)
						.addComponent(scrollPaneStudent, D_SIZE, SIZE / 2, S_MAX)));

		GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(LEADING).addGroup(
				jPanel7Layout.createSequentialGroup().addContainerGap().addComponent(buttStAdd, P_SIZE, P_SIZE, P_SIZE)
						.addGap(GAP, GAP, GAP).addComponent(buttStChange, D_SIZE, SIZE / 3, S_MAX).addGap(GAP, GAP, GAP)
						.addComponent(buttStDelete, P_SIZE, P_SIZE, P_SIZE).addContainerGap()));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(LEADING).addGroup(
				jPanel7Layout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								jPanel7Layout.createParallelGroup(BASELINE).addComponent(buttStAdd).addComponent(buttStChange)
										.addComponent(buttStDelete, P_SIZE, D_SIZE, P_SIZE)).addContainerGap(D_SIZE, S_MAX)));

		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(LEADING)
				.addComponent(jPanel7, D_SIZE, D_SIZE, S_MAX).addComponent(jPanel6, D_SIZE, D_SIZE, S_MAX));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addComponent(jPanel6, D_SIZE, D_SIZE, S_MAX).addPreferredGap(RELATED)
						.addComponent(jPanel7, P_SIZE, D_SIZE, P_SIZE)));

		GroupLayout tabStudentsLayout = new GroupLayout(tabStudents);
		tabStudents.setLayout(tabStudentsLayout);
		scrollPaneStudent.setViewportView(tableStudent);

		tabStudentsLayout.setHorizontalGroup(tabStudentsLayout.createParallelGroup(LEADING).addComponent(jPanel3, TRAILING,
				D_SIZE, D_SIZE, S_MAX));
		tabStudentsLayout.setVerticalGroup(tabStudentsLayout.createParallelGroup(LEADING).addComponent(jPanel3, D_SIZE, D_SIZE,
				S_MAX));

		tabAll.addTab(Data.TAB_STUDENTS, null, tabStudents, Data.TOOLTIP_TAB_STUDENTS);

		labLog.setHorizontalAlignment(0);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(LEADING).addComponent(labLog, D_SIZE, D_SIZE, S_MAX));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(LEADING).addComponent(labLog, TRAILING, D_SIZE,
				D_SIZE, S_MAX));

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);

		layout.setHorizontalGroup(layout.createParallelGroup(LEADING).addComponent(jPanel1, D_SIZE, D_SIZE, S_MAX)
				.addComponent(tabAll));
		layout.setVerticalGroup(layout.createParallelGroup(LEADING).addGroup(
				layout.createSequentialGroup().addComponent(tabAll).addPreferredGap(RELATED)
						.addComponent(jPanel1, P_SIZE, D_SIZE, P_SIZE)));

		setMenuBar();
		setFontForComponents();
		setActionListeners();

		pack();
	}

	private void setActionListeners() {
		buttGrAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				DialogGroup d = new DialogGroup(Frame.this);
				d.setVisible(true);
			}
		});
		buttGrChange.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				DialogStudent d = new DialogStudent(Frame.this);
				d.setVisible(true);
			}
		});
		buttGrDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				DialogGroup d = new DialogGroup(Frame.this);
				d.setVisible(true);
			}
		});
		toggleSort.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				toggleBtnClick(toggleSort.isSelected());
			}
		});
		buttStAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				DialogStudent d = new DialogStudent(Frame.this);
				d.setVisible(true);
			}
		});
		buttStChange.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				DialogStudent d = new DialogStudent(Frame.this);
				d.setVisible(true);
			}
		});
		buttStDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				DialogGroup d = new DialogGroup(Frame.this);
				d.setVisible(true);
			}
		});
		menuFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				DialogGroup d = new DialogGroup(Frame.this);
				d.setVisible(true);
			}
		});
		menuEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent p) {
				DialogGroup d = new DialogGroup(Frame.this);
				d.setVisible(true);
			}
		});
	}

	private void toggleBtnClick(boolean isSelected) {
		toggleSort.setText(isSelected ? Data.BTN_SORTED_BY_FAM : Data.BTN_SORTED_BY_NUM);
	}

	private void setMenuBar() {
		jMenuBar1.add(menuFile);
		jMenuBar1.add(menuEdit);
		setJMenuBar(jMenuBar1);
	}

	private void setTextForComponents() {
		buttGrAdd.setText(Data.BTN_ADD);
		buttGrChange.setText(Data.BTN_CHANGE);
		buttGrDelete.setText(Data.BTN_DELETE);
		toggleSort.setText(Data.BTN_SORTING);
		buttStAdd.setText(Data.BTN_ADD);
		buttStChange.setText(Data.BTN_CHANGE);
		buttStDelete.setText(Data.BTN_CHANGE);
		labLog.setText(Data.LBL_LOG);
		labLog.setToolTipText(Data.TOOLTIP_LOG);
		menuFile.setText(Data.MENU_FILE);
		menuEdit.setText(Data.MENU_EDIT);
	}

	private void initTables() {
		final Class[] TYPES = new Class[Math.max(tableGroup.getColumnCount(), tableStudent.getColumnCount())];
		Arrays.fill(TYPES, java.lang.String.class);

		final boolean[] CAN_EDIT = new boolean[Math.max(tableGroup.getColumnCount(), tableStudent.getColumnCount())];
		Arrays.fill(CAN_EDIT, false);

		tableGroup
				.setModel(new DefaultTableModel(new Object[][] {}, new String[] { Data.TABLE_CODE_GROUP, Data.TABLE_FACULTY }) {
					public Class getColumnClass(int columnIndex) {
						return TYPES[columnIndex];
					}

					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return CAN_EDIT[columnIndex];
					}
				});

		tableStudent.setModel(new DefaultTableModel(new Object[][] {}, new String[] { Data.TABLE_NAME, Data.TABLE_SURNAME,
				Data.TABLE_MIDNAME, Data.TABLE_BIRTHDAY, Data.TABLE_GROUP }) {
			public Class getColumnClass(int columnIndex) {
				return TYPES[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return CAN_EDIT[columnIndex];
			}
		});

		tableGroup.setColumnSelectionAllowed(true);
		tableGroup.getTableHeader().setReorderingAllowed(false);
		tableGroup.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableGroup.getColumnModel().getColumn(0).setResizable(false);
		tableGroup.getColumnModel().getColumn(1).setResizable(false);

		tableStudent.getTableHeader().setReorderingAllowed(false);
		tableStudent.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableStudent.getColumnModel().getColumn(0).setResizable(false);
		tableStudent.getColumnModel().getColumn(1).setResizable(false);
		tableStudent.getColumnModel().getColumn(2).setResizable(false);
		tableStudent.getColumnModel().getColumn(3).setResizable(false);
		tableStudent.getColumnModel().getColumn(4).setResizable(false);

	}

	private void constructor() {
		tabAll = new JTabbedPane();
		tabGroup = new JPanel();
		tableGroup = new JTable();
		buttGrAdd = new JButton();
		buttGrChange = new JButton();
		buttGrDelete = new JButton();
		tabStudents = new JPanel();
		tableStudent = new JTable();
		toggleSort = new JToggleButton();
		buttStAdd = new JButton();
		buttStChange = new JButton();
		buttStDelete = new JButton();
		labLog = new JLabel();
		jMenuBar1 = new JMenuBar();
		menuFile = new JMenu();
		menuEdit = new JMenu();
	}

	private void setFontForComponents() {
		tabAll.setFont(Utils.FONT);
		labLog.setFont(Utils.FONT);
		tabGroup.setFont(Utils.FONT);
	}

	private JButton buttGrAdd;
	private JButton buttGrChange;
	private JButton buttGrDelete;
	private JButton buttStAdd;
	private JButton buttStChange;
	private JButton buttStDelete;
	private JMenuBar jMenuBar1;
	private JLabel labLog;
	private JMenu menuEdit;
	private JMenu menuFile;
	private JTabbedPane tabAll;
	private JPanel tabGroup;
	private JPanel tabStudents;
	private JTable tableGroup;
	private JTable tableStudent;
	private JToggleButton toggleSort;
}