package pa.iscde.speedtext;

import java.util.ArrayList;

import org.eclipse.swt.widgets.List;

public class TestSortList implements SpeedTextSortList{

	@Override
	public void sortList(ArrayList<String> list) {
		System.out.println("worked");
	}

}
