package hsma.uib.ss14.tpe08.p3;
/**
 * Klasse Tiefensuche
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */
public class Tiefensuche<T> implements SearchStrategy<T>{

	private NodeListImpl<T> path = new NodeListImpl<T>();
	
	@Override
	public NodeListImpl<T> search(Node<T> start, Node<T> ziel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodeListImpl<T> getPath() {
		// TODO Auto-generated method stub
		return path;
	}

}
