package pa.iscde.speedtext;


import java.io.File;
import java.util.Collection;
/**
 * Represents an extension point that adds information to the sugestion list
 */
public interface SpeedTextExtraInfo {
	
	/**
	 * Receives the sugestion list and adds information about each element
	 * @param s Collection of strings to add information
	 * @param file(class) with the methods/variables of the list
	 * @return list of new information for methods/variables, must have the same size and order as the param list
	 */
	public String extraInfo(String s, File file);

	public String getName();
	
}
