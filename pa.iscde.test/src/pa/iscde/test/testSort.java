package pa.iscde.test;

import java.util.ArrayList;

import pa.iscde.speedtext.Service;
import pa.iscde.speedtext.SpeedTextSortList;

public class testSort implements SpeedTextSortList{

	@Override
	public void sortList() {
		Service s = Activator.getTestActivator().getSpeedTestService();
		ArrayList<String> list = s.getList();
		System.out.println("ANTES: " + list.toString());

		Object[] aux = list.toArray();
		list.clear();
		for (int x = aux.length-1; x>=0 ; x--){
			list.add((String) aux[x]);
		}
		System.out.println("DEPOIS: " + list.toString());	
		s.setList(list);
	}


}
