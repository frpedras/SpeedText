package pa.iscde.test;

import java.util.ArrayList;

import pa.iscde.speedtext.SpeedTextExtraInfo;

public class testExtra implements SpeedTextExtraInfo {

	@Override
	public ArrayList<String> extraInfo(ArrayList<String> list) {
		System.out.println("antes: "+list.toString());
		Object[] aux = list.toArray();
		list.clear();
		for(int i=0; i<aux.length;i++){
			list.add(aux[i]+" - "+"banana");
		}
		System.out.println("depois: "+list.toString());	
		return list;
	}

}
