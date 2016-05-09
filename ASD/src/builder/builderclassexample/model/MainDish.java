package builder.builderclassexample.model;

public class MainDish {
String name;

public MainDish(String name) {
	super();
	this.name = name;
}

@Override
public String toString() {
	return "MainDish [name=" + name + "]";
}

}
