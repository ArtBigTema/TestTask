package substance;

import java.util.ArrayList;

public class Main {
	private static Main singleton;
	private ArrayList<Student> students;
	private ArrayList<Group> groups;

	public Main() {
		initVariables();
	}

	private void initVariables() {
		students = new ArrayList<Student>();
		groups = new ArrayList<Group>();
	}

	private boolean checVariables() {
		return (students != null || groups != null);
	}

	public void addStudent(String s) {
		if (checVariables()) {
			students.add(Student.getStudent(s));
		}
	}

	public void addGroup(String s) {
		if (checVariables()) {
			groups.add(Group.getGroup(s));
		}
	}

	public static synchronized Main getInstance() {
		if (singleton == null)
			singleton = new Main();
		return singleton;
	}

	public static void p(Object o) {
		System.out.println(o.toString());
	}

	public static void err(Object o) {
		System.err.println(o.toString());
	}
}