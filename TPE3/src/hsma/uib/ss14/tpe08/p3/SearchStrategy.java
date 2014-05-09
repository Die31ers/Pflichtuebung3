package hsma.uib.ss14.tpe08.p3;

/**
 * Die Interface für Such Strategien.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public interface SearchStrategy<T> {

	public NodeListImpl<T> search(Node<T> start, Node<T> ziel);

	public NodeListImpl<T> getPath();

}
