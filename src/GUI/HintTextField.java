package GUI;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

@SuppressWarnings("serial")
class HintTextField extends JTextField implements FocusListener {

	private final String hint;
	private boolean showingHint;

	public HintTextField(final String hint) {
		super(hint);
		this.hint = hint;
		this.showingHint = true;
		super.addFocusListener(this);
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (isEmpty()) {
			super.setText("");
			showingHint = false;
		} else {
			this.selectAll();
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (isEmpty()) {
			super.setText(hint);
			showingHint = true;
		}
	}

	@Override
	public String getText() {
		return showingHint ? "" : super.getText();
	}

	public boolean isEmpty() {
		return this.getText().isEmpty();
	}
}