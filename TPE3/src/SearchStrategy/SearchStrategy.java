package SearchStrategy;

import Node.Node;
import Node.NodeListImpl;

/**
 * Die Interface für die Such-Strategien.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */
public interface SearchStrategy<T>  {
	public NodeListImpl<T> search(Node<T> wurzelKnoten, Node<T> search );
	public NodeListImpl<T> getPath();
}
