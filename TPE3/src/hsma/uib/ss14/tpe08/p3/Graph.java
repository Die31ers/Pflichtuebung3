package hsma.uib.ss14.tpe08.p3;

import hsma.uib.ss14.tpe08.p3.list.NodeListImpl;
import hsma.uib.ss14.tpe08.p3.suche.SearchStrategy;

/**
 * 
 * Die Klasse eines Graphen. jeder Graph besteht aus einem
 * Anfangsknoten(wurzelKnoten) von welchem sich alle anderen Knoten ableiten
 * lassen.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            ein beliebiger Datentyp
 */
public class Graph<T> {
	/**
	 * Dynamischer Typ-Parameter, welcher den Startknoten des Graphen
	 * implementiert.
	 */
	private Node<T> wurzelKnoten;

	/**
	 * Konstruktor eines Graphen
	 * 
	 * @param wurzelKnoten
	 *            der Knoten mit welchem der Graph beginnen soll.
	 */
	public Graph(Node<T> wurzelKnoten) {
		this.wurzelKnoten = wurzelKnoten;
	}

	/**
	 * Kopiert alle Knoten des Graphen in eine übergebene Liste
	 * 
	 * @param liste
	 *            Die Liste in welche die Knoten kopiert werden.
	 * @return die neue gefuellte Liste
	 */
	public NodeListImpl<Node<T>> copyInto(NodeListImpl<Node<T>> liste) {
		return copyIntoRek(this.wurzelKnoten, liste);
	}

	/**
	 * Rekursive Methode, welche rekursiv den Grapheninhalt in eine Liste
	 * generischen Typs(Eine Node generischen) Typs kopiert.
	 * 
	 * @param start
	 *            Der Anfangspunkt
	 * @param liste
	 *            Die Liste in welche kopiert wird
	 * @return eine neue Liste
	 */
	private NodeListImpl<Node<T>> copyIntoRek(Node<T> start, NodeListImpl<Node<T>> liste) {
		if (start != null) {
			if (!liste.contains(start)) {
				liste.add(start);
				for (Node<T> knoten : start.getChildren()) {
					copyIntoRek(knoten, liste);
				}
			}
		}
		return liste;
	}

	/**
	 * Methode, welche, mittels Funktionsübergabe (Callback) eine Klasse ruft.
	 * 
	 * @param gesucht
	 *            der Knoten der gesucht werden soll.
	 * @param strategy
	 *            die gewaehlte Suchstrategie
	 * @return Eine Liste der uebereinstimmenden Knoten
	 */
	public NodeListImpl<Node<T>> search(T gesucht, SearchStrategy<T> strategy) {
		return strategy.search(wurzelKnoten, gesucht);
	}

}
