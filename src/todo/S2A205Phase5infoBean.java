package todo;

import java.io.Serializable;
import java.util.ArrayList;

public class S2A205Phase5infoBean implements Serializable {

	private ArrayList<S2A205Phase5RecordBean> RecordArray = new ArrayList<S2A205Phase5RecordBean>();

	public S2A205Phase5infoBean() {
	}

	public ArrayList<S2A205Phase5RecordBean> getRecordArray() {
		return RecordArray;
	}

	public void addstudentRecord(S2A205Phase5RecordBean obj) {
		RecordArray.add(obj);
	}

	public int getArraySize() {
		return RecordArray.size();
	}

}
