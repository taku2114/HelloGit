package app;

import java.io.Serializable;
import java.util.ArrayList;

public class S2A205infoBean implements Serializable {

	private ArrayList<S2A205RecordBean> RecordArray = new ArrayList<S2A205RecordBean>();

	public S2A205infoBean() {
	}

	public ArrayList<S2A205RecordBean> getRecordArray() {
		return RecordArray;
	}

	public void addstudentRecord(S2A205RecordBean obj) {
		RecordArray.add(obj);
	}

	public int getArraySize() {
		return RecordArray.size();
	}

	public void deletestudentRecord(int index) {
		RecordArray.remove(index);
	}

	public void UpdatestudentRecord(int index, S2A205RecordBean obj) {
		RecordArray.set(index, obj);
	}
}
