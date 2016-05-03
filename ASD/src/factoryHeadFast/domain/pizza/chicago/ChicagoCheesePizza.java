package factoryHeadFast.domain.pizza.chicago;

import factoryHeadFast.domain.pizza.Pizza;

public class ChicagoCheesePizza extends Pizza {
	public ChicagoCheesePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozarella Cheese");
	}

	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
