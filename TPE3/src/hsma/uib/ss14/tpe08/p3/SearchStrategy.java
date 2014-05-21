package hsma.uib.ss14.tpe08.p3;

/**
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */

public interface SearchStrategy<T> {

	/**
	 * Methode f�r NodeList, die jedoch in den Klassen �berschrieben wird.
	 * 
	 * @param wurzel
	 * @param ziel
	 * @return
	 */
	public NodeList<T> search(Node wurzel, Node ziel);
	public NodeList<T> getPath(Node wurzel);
	
}
