package decorator.labsoln;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListProfiler extends Profiler {
	List<Object> list;

	public ArrayListProfiler(List<Object> list) {
		this.list = list;
	}

	@Override
	public boolean add(Object e) {

		return list.add(e);
	}

	@Override
	public void add(int index, Object element) {
		list.add(index, element);

	}

	@Override
	public boolean addAll(Collection<? extends Object> c) {

		return list.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends Object> c) {
		return list.addAll(index, c);
	}

	@Override
	public void clear() {
		list.clear();

	}

	@Override
	public boolean contains(Object o) {
		return list.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return list.containsAll(c);
	}

	@Override
	public Object get(int index) {

		return list.get(index);
	}

	@Override
	public int indexOf(Object o) {

		return list.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public Iterator<Object> iterator() {
		
		return list.iterator();
	}

	@Override
	public int lastIndexOf(Object o) {
		return list.lastIndexOf(o);
	}

	@Override
	public ListIterator<Object> listIterator() {
		return list.listIterator();
	}

	@Override
	public ListIterator<Object> listIterator(int index) {
		return list.listIterator(index);
	}

	@Override
	public boolean remove(Object o) {
		return list.remove(o);
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public List<Object> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
