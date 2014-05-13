package hsma.uib.ss14.tpe08.p3;

/**
 * Die Klasse Node soll eine generische Klasse sein. In dieser Klasse wird das
 * hinzufuegen der Kinderknoten geschehen.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */

public class Node<E extends Comparable<E>>  {

	E elem;
	Node<E> next, previous;

	private Node parent;
	private String name;
	private String attributes;
	String value;

	
	public void addChild(Node<E> elem) {
	
		
	}

	public void getChildren() {
		
	}

	/**
	 * Diese Methode gibt den Namen zurueck.
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Diese Methode gibt den Wert zurueck.
	 * @return
	 */
	public String getValue() {
		return value;
	}
}
