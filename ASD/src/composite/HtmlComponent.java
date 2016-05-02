package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HtmlComponent extends HtmlDocument {
	List<HtmlDocument> htmlComponents = new ArrayList<>();
	String name;

	public HtmlComponent(String name) {
		this.name = name;
	}

	public void add(HtmlDocument htmlComponent) {
		htmlComponents.add(htmlComponent);
	}

	public void remove(HtmlDocument htmlComponent) {
		htmlComponents.remove(htmlComponent);
	}

	public HtmlDocument getChild(int i) {
		return (HtmlDocument) htmlComponents.get(i);
	}

	public void print() {
		System.out.println(name);
		Iterator<HtmlDocument> iterator = htmlComponents.iterator();
		while (iterator.hasNext()) {
			HtmlDocument htmlComponent = (HtmlDocument) iterator.next();
			htmlComponent.print();
		}

	}
}
