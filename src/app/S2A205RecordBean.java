package app;

import java.io.Serializable;

public class S2A205RecordBean implements Serializable {

	private String important;
	private String text;
	private String memo;
	private String li;

	public S2A205RecordBean() {
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

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getLi() {
		return this.li;
	}

	public void setLi(String li) {
		this.li = li;
	}
}