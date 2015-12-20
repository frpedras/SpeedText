package pa.iscde.speedtext;

import java.util.List;

public class ServiceImplementation implements Service{

	@Override
	public List getList() {
		return (List)SpeedTextService.getSpeedTextService().getList();
	}

}
