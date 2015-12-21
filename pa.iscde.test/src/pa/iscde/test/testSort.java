package pa.iscde.test;

import java.util.Collection;

import pa.iscde.speedtext.SpeedTextSortList;

public class testSort implements SpeedTextSortList{

	@Override
	public Collection<String> sortList(Collection<String> list) {
		Object[] aux = list.toArray();
		list.clear();
		for (int x = aux.length-1; x>=0 ; x--){
			list.add((String) aux[x]);
		}
		return list;
	}
}
