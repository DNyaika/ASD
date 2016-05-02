package composite;

public class HtmlElement extends HtmlDocument {
	String name;
	String value;

	public HtmlElement(String name, String value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public void print() {
		System.out.println(getName()+""+getValue());
	}
}
