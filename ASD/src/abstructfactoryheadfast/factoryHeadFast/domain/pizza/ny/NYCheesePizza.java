package abstructfactoryheadfast.factoryHeadFast.domain.pizza.ny;

import factoryHeadFast.domain.pizza.Pizza;

public class NYCheesePizza extends Pizza {
	public NYCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin crust Dough";
		sauce = "Marina Sauce";
		toppings.add("Grated Reggiano Cheese");
	}

	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
