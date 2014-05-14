package hsma.uib.ss14.tpe08.p3;

/**
 * Methode, die das Suchen in Graph erleichtern
 * 
 * @author Ketcha
 * 
 * @param <T>
 */
public abstract class SuchHelfer<T> {
	// Mann kann den Weg, den die Suche beim leten Durchlauf durch den Graphen
	// genommen hat auslesen
	protected NodeListImpl<Node<T>> letztenDurchlauf = new NodeListImpl<Node<T>>();
}