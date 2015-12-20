package pa.iscde.speedtext;

import java.util.ArrayList;

public class ServiceImplementation implements Service{

	@Override
	public ArrayList getList() {
		ArrayList<String> ret = new ArrayList<String>();
		String[] aux = SpeedTextService.getSpeedTextService().getList().getItems();
		for(int i=0; i<aux.length;i++){
			ret.add(aux[i]);
		}
		return ret;
	}

}
