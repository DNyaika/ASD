package decorator.labsoln;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String... args) {
		long start = 0;
		long end = 0;
		Object object = new Object();
		List<Object> arrayList = new ArrayList<Object>();
		List<Object> linkedList = new LinkedList<>();
		Profiler arrayLIstProfiler = new ArrayListProfiler(arrayList);
		Profiler linkedListProfiler = new LinkedListProfiler(linkedList);
		System.out.println("-------ArrayList--------");
		start = System.currentTimeMillis();
		arrayLIstProfiler.add(object);
		end = System.currentTimeMillis();
		System.out.println("boolean add(E e)     " + (end - start) + "Milliseconds");
		start = System.currentTimeMillis();
		arrayLIstProfiler.contains(object);
		end = System.currentTimeMillis();
		System.out.println("boolean contains(Object o)     " + (end - start) + "Milliseconds");
		start = System.currentTimeMillis();
		arrayLIstProfiler.size();
		end = System.currentTimeMillis();
		System.out.println("int size()    " + (end - start) + "Milliseconds");
		start = System.currentTimeMillis();
		arrayLIstProfiler.remove(object);
		end = System.currentTimeMillis();
		System.out.println("boolean remove(Object o)     " + (end - start) + "Milliseconds\n\n\n");
		System.out.println("-------LinkedList--------");
		start = System.currentTimeMillis();
		linkedListProfiler.add(object);
		end = System.currentTimeMillis();
		System.out.println("boolean add(E e)     " + (end - start) + "Milliseconds");
		start = System.currentTimeMillis();
		linkedListProfiler.contains(object);
		end = System.currentTimeMillis();
		System.out.println("boolean contains(Object o)     " + (end - start) + "Milliseconds");
		start = System.currentTimeMillis();
		linkedListProfiler.size();
		end = System.currentTimeMillis();
		System.out.println("int size()    " + (end - start) + "Milliseconds");
		start = System.currentTimeMillis();
		linkedListProfiler.remove(object);
		end = System.currentTimeMillis();
		System.out.println("boolean remove(Object o)     " + (end - start) + "Milliseconds\n\n\n");
	}
}
