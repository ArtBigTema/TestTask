package Utils;

import java.util.Locale;

public class Data {
	public static final byte GAP = 15;
	public static final int SIZE = 600;
	public static final short S_MAX = 5000;
	public static Locale l = Locale.ENGLISH;// RU

	public static final String BTN_OK = isUK() ? "Ok" : "��";
	public static final String BTN_CANCEL = isUK() ? "Cancel" : "������";
	public static final String BTN_ADD = isUK() ? "Add" : "��������";
	public static final String BTN_CHANGE = isUK() ? "Change" : "��������";
	public static final String BTN_DELETE = isUK() ? "Delete" : "�������";
	public static final String BTN_SORTING = isUK() ? "Sorting" : "����������";
	public static final String BTN_SORTED_BY_FAM = isUK() ? "������������� �� �������" : "������������� �� �������";
	public static final String BTN_SORTED_BY_NUM = isUK() ? "������������� �� ���� �������������"
			: "������������� �� ���� �������������";

	public static final String LBL_LOG = isUK() ? "Log" : "���";
	public static final String LBL_GROUPS = isUK() ? "���� ����� ��� �������������� �����"
			: "���� ����� ��� �������������� �����";
	public static final String LBL_GROUP_COMM = isUK() ? "��������� ������������ �������������"
			: "��������� ������������ �������������";

	public static final String TOOLTIP_LOG = isUK() ? "����� ����� ������������ ��������" : "����� ����� ������������ ��������";
	public static final String TOOLTIP_TAB_GROUPS = isUK() ? "����� ����� ������������ ������"
			: "����� ����� ������������ ������";
	public static final String TOOLTIP_TAB_STUDENTS = isUK() ? "����� ����� ������������ ��������"
			: "����� ����� ������������ ��������";

	public static final String MENU_FILE = isUK() ? "File" : "����";
	public static final String MENU_EDIT = isUK() ? "Edit" : "��������";

	public static final String TAB_GROUPS = isUK() ? "           Groups           " : "           ������           ";
	public static final String TAB_STUDENTS = isUK() ? "           Students           " : "           ��������           ";

	public static final String TABLE_NAME = isUK() ? "Name" : "���";
	public static final String TABLE_SURNAME = isUK() ? "Surname" : "�������";
	public static final String TABLE_MIDNAME = isUK() ? "Middle Name" : "��������";
	public static final String TABLE_BIRTHDAY = isUK() ? "Date of Birth" : "���� ��������";
	public static final String TABLE_GROUP = isUK() ? "Group" : "������";
	public static final String TABLE_CODE_GROUP = isUK() ? "Code of group" : "��� ������";
	public static final String TABLE_FACULTY = isUK() ? "Faculty" : "���������";

	public static final String TF_GROUPS = isUK() ? "Enter group code" : "������� ��� ������";
	public static final String TF_STUDENTS = isUK() ? "Enter" : "�������";

	public static boolean isUK() {
		return true;//l.getLanguage().equals("en");     //FIXME
	}
}
