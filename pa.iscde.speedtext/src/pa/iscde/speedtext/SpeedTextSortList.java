package pa.iscde.speedtext;


import java.util.Collection;

/**
 * Represents an extension point to sort the sugestion list
 */
public interface SpeedTextSortList {
	/**
	 * Receives the sugestion list and returns it sorted, with the same elements
	 * @param list Collection of strings to sort
	 * @return a Collection sorted
	 */
	public Collection<String> sortList(Collection<String> list);
}
