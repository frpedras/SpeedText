package pa.iscde.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator{
	private static Activator testActivator;
	@Override
	public void start(BundleContext context) throws Exception {
		testActivator = this;
	}

	public static Activator getTestActivator() {
		return testActivator;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
