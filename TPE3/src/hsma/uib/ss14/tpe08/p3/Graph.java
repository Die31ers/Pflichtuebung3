package hsma.uib.ss14.tpe08.p3;

/**
 * class  Graph
 * Der Graph besteht aus beliebiege Anzahl von Konten,wobei 
 * einer der Knoten als Anfangsknoten ausgezeignet wird 
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 * @param <T>
 * @param search
 * @param  copyInto
 * 
 */
public class Graph<T> {

	Node<T> head;
	// jede knote kennt sein direkte kinder
	NodeListImpl<Node<T>> knoten = new NodeListImpl<Node<T>>();
//Konstruktor f�r Generic 
	public Graph(Node<T> head) {
		this.head = head;
	}

	public Node<T> getHead() {
		return this.head;
	}
//Suchen nach alle Knoten mit einem bestimmten Wert
	public NodeListImpl<Node<T>> search(T wert, SearchStrategy<T> methoden) {
		return methoden.search(head, wert);
	}
//Koppieren alle Knoten in einer �bergegebene List 
	public NodeListImpl<Node<T>> copyInto() {
		NodeListImpl<Node<T>> copyListe = new NodeListImpl<Node<T>>();
		copyListe.add(this.head);
		for (Node<T> node : this.knoten) {
			copyListe.add(node);
		}
		return copyListe;
	}
//
//	 public String copyInto() {
//	return " ";

}
 