package builder.builderTutorial;

public class Director {
	CarBuilder builder;

	public Director(CarBuilder builder) {
		super();
		this.builder = builder;
	}

	public CarBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(CarBuilder builder) {
		this.builder = builder;
	}

	public void build() {
		this.builder.makeCar();
	}
}
