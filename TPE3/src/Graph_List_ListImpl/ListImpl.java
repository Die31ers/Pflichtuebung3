package Graph_List_ListImpl;

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

	LinkedList<T> list = new LinkedList<T>();

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

	@Override
	public boolean contains(Object e) {
		return list.contains(e);
	}

	public int size() {
		return list.size();
	}

	@Override
	public boolean add(Object e) {
		return list.add(e);
	}

	@Override
	public void addFirst(T e) {
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
