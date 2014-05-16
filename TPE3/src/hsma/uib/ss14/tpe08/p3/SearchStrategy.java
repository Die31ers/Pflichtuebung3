package hsma.uib.ss14.tpe08.p3;

/**
 * Interface f�r die Suche in Graph Diese Inteface hat zwei Methode : search und
 * getPath
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *  
 * @param <T>
 */
public interface SearchStrategy<T> {

	public NodeListImpl<Node<T>> search(Node<T> startknoten, T value);

	public NodeListImpl<Node<T>> getPath();

}