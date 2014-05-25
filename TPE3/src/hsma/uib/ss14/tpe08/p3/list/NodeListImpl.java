package hsma.uib.ss14.tpe08.p3.list;

import hsma.uib.ss14.tpe08.p3.Node;



/**
 * Klasse NodeListImpl welche eine erweiterung der Klasse ListImpl darstellt.
 * Dieser liste ist es nur erlaubt Node (Knoten) aufzunehmen. Im Vergleich dazu
 * darf die Klasse ListImpl alle Datentypen aufnehmen.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 * @param <T>
 *            Ein beliebiger Datentyp
 */

public class  NodeListImpl<T> extends ListImpl<Node<T>> implements NodeList<T> {

	private static final long serialVersionUID = 1L;

}
