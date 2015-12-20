package pa.iscde.test;

import java.util.ArrayList;

import org.eclipse.swt.widgets.List;

import pa.iscde.speedtext.SpeedTextSortList;

public class testSort implements SpeedTextSortList{

	@Override
	public void sortList(ArrayList<String> list) {
		String[] aux = (String[]) list.toArray();
		list.clear();
		for (int x = aux.length-1; x>=0 ; x--){
			list.add(aux[x]);
		}
		System.out.println("bananaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}


}
