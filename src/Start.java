import GUI.Frame;

public class Start implements Runnable {

	public static void main(String[] args) {
		new Start().run();
	}

	public static void p(Object o) {
		System.out.println(o.toString());
	}

	@Override
	public void run() {
		Frame frame = new Frame();
		frame.setVisible(true);
	}
}