package abstructfactoryheadfast.factoryHeadFast.domain.pizza;

import java.util.Arrays;

import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Cheese;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Clams;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Dough;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Pepperoni;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Sauce;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Veggies;

public abstract class Pizza {
	public String name;
	public Dough dough;
	public Sauce sauce;
	// public List<String> toppings = new ArrayList<String>();
	public Veggies veggies[];
	public Cheese cheese;
	public Pepperoni pepperoni;
	public Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25  minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce
				+ ", veggies=" + Arrays.toString(veggies) + ", cheese="
				+ cheese + ", pepperoni=" + pepperoni + ", clam=" + clam + "]";
	}

}
