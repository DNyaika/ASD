package factoryHeadFast;

import factoryHeadFast.domain.pizza.Pizza;
import factoryHeadFast.domain.pizza.chicago.ChicagoCheesePizza;
import factoryHeadFast.domain.pizza.chicago.ChicagoClamPizza;
import factoryHeadFast.domain.pizza.chicago.ChicagoPepperoniPizza;
import factoryHeadFast.domain.pizza.chicago.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("Cheese")) {
			pizza = new ChicagoCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoPepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new ChicagoVeggiePizza();
		}

		return pizza;
	}

}
