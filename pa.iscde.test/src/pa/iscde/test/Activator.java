package pa.iscde.test;

import java.util.List;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import pa.iscde.speedtext.Service;

public class Activator implements BundleActivator{
	private static Activator testActivator;
	private BundleContext context;
	private Service speedTestservice;
	
	
	@Override
	public void start(BundleContext context) throws Exception {
		testActivator = this;
		this.context = context;
		ServiceReference<Service> serviceReference = context.getServiceReference(Service.class);
		speedTestservice = context.getService(serviceReference);
		
	}
	
	public Service getSpeedTestService(){
		return speedTestservice;
	}

	public static Activator getTestActivator() {
		return testActivator;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
