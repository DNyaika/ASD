package abstructfactoryheadfast.factoryHeadFast.domain.pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	public List<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough.......");
		System.out.println("Adding sauce.....");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("  " + toppings.get(i));
		}
	}

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
}
