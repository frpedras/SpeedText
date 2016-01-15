package pa.iscde.speedtext;


/**
 * Represents an extension point to sort the sugestion list
 */
public interface SpeedTextSortList {
		
	/**
	 * Receives 2 strings and compare them
	 * @param String a to compare
	 * @param String b to compare
	 * @return true if the String a should appear before String b in the suggestion list
	 */
	public boolean compare(String a, String b);
	
	public String getName();
}
