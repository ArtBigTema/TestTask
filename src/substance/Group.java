package substance;

import Utils.Utils;

public class Group {
	private long codeGroup = 0l;
	private String faculty = "";

	public Group(long code) {
		this.codeGroup = code;
		generateFacoltyForCodeGroup();
	}

	public Group(String code) {
		this.codeGroup = Utils.getLong(code);
		generateFacoltyForCodeGroup();
	}

	public Group(long code, String fac) {
		this.codeGroup = code;
		this.faculty = fac;
	}

	public static Group getGroup(String s) {
		String[] split = s.split("|");
		if (split == null || split.length < 1) {
			return null;
		}
		return new Group(split[0]);
	}

	private void generateFacoltyForCodeGroup() {
		this.faculty = Utils.getStr(this.codeGroup);// FIXME
	}

	public long getGroup() {
		return codeGroup;
	}

	public String getFaculty() {
		return faculty;
	}

	@Override
	public String toString() {
		return "Group [codeGroup=" + codeGroup + ", faculty=" + faculty + "]";
	}
}