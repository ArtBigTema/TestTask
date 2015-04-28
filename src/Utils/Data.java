package Utils;

import java.util.Locale;

public class Data {
	public static final byte GAP = 15;
	public static final int SIZE = 600;
	public static final short S_MAX = 5000;
	public static Locale l = Locale.ENGLISH;// RU

	public static final String BTN_OK = isUK() ? "Ok" : "Ок";
	public static final String BTN_CANCEL = isUK() ? "Cancel" : "Отмена";
	public static final String BTN_ADD = isUK() ? "Add" : "Добавить";
	public static final String BTN_CHANGE = isUK() ? "Change" : "Изменить";
	public static final String BTN_DELETE = isUK() ? "Delete" : "Удалить";
	public static final String BTN_SORTING = isUK() ? "Sorting" : "Сортировка";
	public static final String BTN_SORTED_BY_FAM = isUK() ? "Отсортировано по фамилии" : "Отсортировано по фамилии";
	public static final String BTN_SORTED_BY_NUM = isUK() ? "Отсортировано по коду специальности"
			: "Отсортировано по коду специальности";

	public static final String LBL_LOG = isUK() ? "Log" : "Лог";
	public static final String LBL_GROUPS = isUK() ? "Поле ввода или редактирования групп"
			: "Поле ввода или редактирования групп";
	public static final String LBL_GROUP_COMM = isUK() ? "факультет генерируется автоматически"
			: "факультет генерируется автоматически";

	public static final String TOOLTIP_LOG = isUK() ? "Здесь будут отображаться действия" : "Здесь будут отображаться действия";
	public static final String TOOLTIP_TAB_GROUPS = isUK() ? "Здесь будут отображаться списки"
			: "Здесь будут отображаться списки";
	public static final String TOOLTIP_TAB_STUDENTS = isUK() ? "Здесь будут отображаться студенты"
			: "Здесь будут отображаться студенты";

	public static final String MENU_FILE = isUK() ? "File" : "Файл";
	public static final String MENU_EDIT = isUK() ? "Edit" : "Изменить";

	public static final String TAB_GROUPS = isUK() ? "           Groups           " : "           Группы           ";
	public static final String TAB_STUDENTS = isUK() ? "           Students           " : "           Студенты           ";

	public static final String TABLE_NAME = isUK() ? "Name" : "Имя";
	public static final String TABLE_SURNAME = isUK() ? "Surname" : "Фамилия";
	public static final String TABLE_MIDNAME = isUK() ? "Middle Name" : "Отчество";
	public static final String TABLE_BIRTHDAY = isUK() ? "Date of Birth" : "Дата рождения";
	public static final String TABLE_GROUP = isUK() ? "Group" : "Группа";
	public static final String TABLE_CODE_GROUP = isUK() ? "Code of group" : "Код группы";
	public static final String TABLE_FACULTY = isUK() ? "Faculty" : "Факультет";

	public static final String TF_GROUPS = isUK() ? "Enter group code" : "Введите код группы";
	public static final String TF_STUDENTS = isUK() ? "Enter" : "Введите";

	public static boolean isUK() {
		return l.getLanguage().equals("en");
	}
}
