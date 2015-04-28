package substance;

import Utils.Utils;

public class Student {
	// private String datePattern = "dd.mm.yyyy";
	// private SimpleDateFormat dateFormatter =
	// new SimpleDateFormat(datePattern);

	private String name = "";
	private String surName = "";
	private String midName = "";
	private String birthDay = "";
	private long codeGroup = 0l;
	private Group group;

	public Student(String name, String sname, String mname, String birth, String codeGroup) {
		this.name = name;
		this.surName = sname;
		this.midName = mname;
		this.birthDay = birth;
		this.codeGroup = Utils.getLong(codeGroup).longValue();
		setGroup(this.codeGroup);
	}

	public static Student getStudent(String s) {
		String[] split = s.split("&");
		if (split == null || split.length < 4) {
			return null;
		}
		return new Student(split[0], split[1], split[2], split[3], split[4]);
	}

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	public String getMiddleName() {
		return midName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public long getGroup() {
		return codeGroup;
	}

	public String getFullGroup() {
		return group.toString();
	}

	public String getFullName() {
		return getSurName() + " " + getName() + " " + getMiddleName();
	}

	public void setGroup(long codeGroup) {
		this.group = new Group(codeGroup);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surName=" + surName + ", midName=" + midName + ", birthDay=" + birthDay
				+ ", group=" + group + "]";
	}
}