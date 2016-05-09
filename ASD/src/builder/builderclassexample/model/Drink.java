package builder.builderclassexample.model;

public class Drink {
String name;

public Drink(String name) {
	super();
	this.name = name;
}

@Override
public String toString() {
	return "Drink [name=" + name + "]";
}
}
