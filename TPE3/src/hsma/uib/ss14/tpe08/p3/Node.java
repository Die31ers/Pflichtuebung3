package hsma.uib.ss14.tpe08.p3;

import java.nio.file.WatchEvent.Kind;

import java.util.Collections;

/**
 * Classe, die die Knoten implementiert Eine Graph besteht aus Koten ,jeder
 * Knoten hat ein Namen und einen Wert beliebige Typen
 * 
 * @author Ketcha
 * 
 * @param <T>
 * 
 *            R�ckgabewert: Name und Wert jades Knotens
 */
public class Node<T> {
	private String name;
	protected T value;
	private NodeListImpl<Node<T>> kinder = new NodeListImpl<Node<T>>();

	// Konstruktor f�r Node ,der aus Name ,wert und eine List besteht
	public Node(String name, T value, Node<T>... kinder) {
		this.name = name;
		this.value = value;
		Collections.addAll(this.kinder, kinder);
	}

	// Hinf�gen eines Kindknotens
	public void addChild(Node<T> kind) {
		this.kinder.add(kind);

	}

	// Auslesen aller Kindnoten
	public NodeListImpl<Node<T>> getChildren() {
		return kinder;
	}

	// Auslesen des Names der Knotens
	public String getName() {
		return this.name;
	}

	// Auslesen des Wertes des Knotens
	public T getValue() {
		return value;
	}

	// Name und Wert des Knotens werden ausgelesen
	@Override
	public String toString() {
		return "(" + name + "|" + value + ")";

	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (value != null ? value.hashCode() : 0);
		result = 31 * result + (kinder != null ? kinder.hashCode() : 0);
		return result;
	}


	  
	    // TODO: andere implementierung suchen, kinder.equals vergleicht alle kinder
	    // miteinander -> endlose Rekursion wenn A --> B und B --> A zeigt.
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Node other = (Node) obj;
	        if (name == null) {
	            if (other.name != null)
	                return false;
	        } else if (!name.equals(other.name))
	            return false;
	        if (value == null) {
	            if (other.value != null)
	                return false;
	        } else if (!value.equals(other.value))
	            return false;
	        return true;
	    }
	  
	}
