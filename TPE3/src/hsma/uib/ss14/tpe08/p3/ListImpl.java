package hsma.uib.ss14.tpe08.p3;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Verwaltung von Listen.
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 *
 */
public class ListImpl<T> implements List<T>{
	LinkedList list = new LinkedList();

	@Override
	public Iterator iterator() {
		return list.iterator();
	}

	@Override
	public boolean contains(Object e) {
		return list.contains(e);
	}

	private int size() {
		return list.size();
	}

	@Override
	public boolean add(Object e) {
		return list.add(e);
	}

	@Override
	public void addFirst(Object e) {
		list.addFirst(e);
	}

	@Override
	public T peekFirst() {
		return (T) list.peekFirst(); // T gecastet. Ist das erlaubt?
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public T pollFirst() {
		return (T) list.pollFirst(); // T gecastet. Ist das erlaubt?
	}

	@Override
	public void clear() {
		list.clear();
		
	}
	
}
