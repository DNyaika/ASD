package headfastfactory;

import factoryHeadFast.domain.pizza.Pizza;
import factoryHeadFast.domain.pizza.ny.NYCheesePizza;
import factoryHeadFast.domain.pizza.ny.NYClamPizza;
import factoryHeadFast.domain.pizza.ny.NYPepperoniPizza;
import factoryHeadFast.domain.pizza.ny.NYVeggiePizza;

public class NYPizzaStore extends PizzaStore {
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("Cheese")) {
			pizza = new NYCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYPepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new NYClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new NYVeggiePizza();
		}

		return pizza;
	}

}
