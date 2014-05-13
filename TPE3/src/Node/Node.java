package Node;

import java.util.Iterator;

import SearchStrategy.*;
import hsma.uib.ss14.tpe08.p3.*;

/**
 * Die Klasse Node soll eine generische Klasse sein. In dieser Klasse wird das
 * hinzufuegen der Kinderknoten geschehen.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */

public class Node<T> {

    T elem;
    Node<T> next, previous;

    private Node parent;
    private String name;
    private String attributes;
    String value;
	/**
	 * Das Hinzufuegen eines Kindknotens.
	 * 
	 * @param A
	 */
	public <T> void addChild(List<T>A) {
		//A.add();
	}

	public void getChildren() {
	}

	/**
	 * Diese Methode gibt den Namen zurueck.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Diese Methode gibt den Wert zurueck.
	 * 
	 * @return
	 */
	public String getValue() {
		return value;
	}

}