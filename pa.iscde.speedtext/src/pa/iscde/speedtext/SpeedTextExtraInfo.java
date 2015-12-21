package pa.iscde.speedtext;


import java.util.Collection;
/**
 * Represents an extension point that adds information to the sugestion list
 */
public interface SpeedTextExtraInfo {
	
	/**
	 * Include the element?
	 * @param element Element to include or not
	 * @param parent Parent package of the element
	 * @return true if the element should be included, false otherwise
	 */
	public Collection<String> extraInfo(Collection<String> list);
}
