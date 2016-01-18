package pa.iscde.speedtext;


import java.io.File;
import java.util.Collection;
/**
 * Represents an extension point that adds information to the sugestion list
 */
public interface SpeedTextExtraInfo {
	
	/**
	 * Receives a String of the sugestion list and adds information about this element
	 * @param s String name of method/variable
	 * @param file(class) with the methods/variables of the list
	 * @return String of new information for the methods/variable
	 */
	public String extraInfo(String s, File file);

	public String getName();
	
}
