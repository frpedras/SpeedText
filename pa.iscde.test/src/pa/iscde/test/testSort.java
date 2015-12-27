package pa.iscde.test;

import pa.iscde.speedtext.SpeedTextSortList;

public class testSort implements SpeedTextSortList{

	@Override
	public boolean compare(String a, String b) {
		//Ascending order by the size of strings
		if (a.length()>b.length())
			return false;
		else if(a.length()==b.length())
			return false;
		return true;
	}
}
