package Node;

import java.util.Iterator;


import Graph_List_ListImpl.List;

/**
 * Implementierung der spezialisierten Version des Interface NodeList, die nur
 * Knoten verwalten kann!
 * 
 * @author Giang Pham
 * @author Joshua Barsoum
 * @author Hunar Mawlod
 * 
 */
public interface NodeList<T> extends List<T> {
	
	
	@Override
	public Iterator iterator();

	@Override
	public boolean contains(Object e);

	@Override
	public boolean add(Object e);

	@Override
	public void addFirst(Object e);

	@Override
	public T peekFirst();

	@Override
	public boolean isEmpty();

	@Override
	public T pollFirst();

	@Override
	public void clear();

}