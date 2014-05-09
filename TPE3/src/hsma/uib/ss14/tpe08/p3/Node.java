package hsma.uib.ss14.tpe08.p3;

/**
 * Generische Klasse Knoten
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public class Node<T> {

	public String name;
	public T value;
	public NodeListImpl<T> children;

	public Node(String s, T value) {
		this.name = s;
		this.value = value;
		this.children = new NodeListImpl<T>();
	}

	public void addChild(Node<T>...nodes) { // 1 oder mehrere. 
		for (Node<T> value : nodes) { // iteriert
			children.add(value);
		}
	}

	public NodeListImpl<T> getChildren() {
		return children;

	}

	public String getName() {
		return this.name;
	}

	public T getValue() {
		return value;
	}
}
