package pa.iscde.test;

import org.eclipse.swt.widgets.List;

import pa.iscde.speedtext.SpeedTextSortList;

public class testSort implements SpeedTextSortList{

	@Override
	public void SortList(List list) {
		String[] aux = list.getItems();
		list.removeAll();
		for (int x = aux.length-1; x>=0 ; x--){
			list.add(aux[x]);
		}
		System.out.println("bananaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}

}
