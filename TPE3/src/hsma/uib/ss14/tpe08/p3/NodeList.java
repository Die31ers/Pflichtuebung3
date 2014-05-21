package hsma.uib.ss14.tpe08.p3;

/**
 * Einfache Datenstruktur zur Verwaltung einer Reihe von Knoten.
 * 
 * Die Klasse NodeList erbt von der Klasse Iterable ihre Methoden und Variable.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 * @param <Node>
 */
public interface NodeList<Node> extends Iterable<Node> {

	/**
	 * Liefert die l�nge der Liste zur�ck.
	 *  
	 * @return gr�sse der Liste
	 */
	public abstract int size();
	
	/**
	 * Liefert das Letzte Element ohne es zu entfernen.
	 * 
	 * @return das letzte Element
	 */
	public abstract Node getLast();
	
	/**
	 * L�scht das letzte Element.
	 * 
	 * @return Liste ohne das letzte Element
	 */
	public abstract Node removeLast();
	
	/**
	 * �berpr�ft, ob ein Element bereits vorhanden ist.
	 * 
	 * 
	 @param e
	 *            Element auf das gepr�ft werden soll
	 * 
	 @return true wenn vorhanden, anderfalls false
	 */
	public abstract boolean contains(Object e);

	/**
	 * F�gt am Anfang ein Element hinzu.
	 * 
	 * 
	 @param e
	 *            Element das hinzugef�gt werden soll.
	 * 
	 @return ist immer true.
	 */
	public abstract boolean add(Node e);

	/**
	 * Fuegt am Anfang ein Element hinzu.
	 * 
	 * 
	 @param e
	 *            Element, das angefuegt werden soll.
	 */
	public abstract void addFirst(Node e);

	/**
	 * Liefert das erste Element ohne es zu entfernen.
	 * 
	 * 
	 @return das erste Element
	 */
	public abstract Node peekFirst();

	/**
	 * Ueberprueft, ob Element vorhanden sind.
	 * 
	 * 
	 @return ture, wenn die Datenstruktur leer ist, anderfalls false.
	 */
	public abstract boolean isEmpty();

	/**
	 * Entfernt das erste Element und liefert es zurueck.
	 * 
	 * 
	 @return das erste Element
	 */
	public abstract Node pollFirst();

	/**
	 * Loescht den Inhalt der List.
	 */
	public abstract void clear();
	

}
