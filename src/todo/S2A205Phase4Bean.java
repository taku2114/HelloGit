package todo;

import java.io.Serializable;

public class S2A205Phase4Bean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String Important;
	private String Text;

	public S2A205Phase4Bean() {
	}

	public String getImportant() {
		return this.Important;
	}

	public void setImportant(String important) {
		this.Important = important;
	}

	public String getText() {
		return this.Text;
	}

	public void setText(String text) {
		this.Text = text;
	}
}
