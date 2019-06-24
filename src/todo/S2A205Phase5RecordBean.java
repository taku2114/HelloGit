package todo;

import java.io.Serializable;

public class S2A205Phase5RecordBean implements Serializable {

	private String important;
	private String text;

	public S2A205Phase5RecordBean() {
	}

	public String getImportant() {
		return this.important;
	}

	public void setImportant(String important) {
		this.important = important;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
}