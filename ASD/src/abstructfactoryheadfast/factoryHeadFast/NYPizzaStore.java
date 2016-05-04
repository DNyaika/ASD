package abstructfactoryheadfast.factoryHeadFast;

import abstructfactoryheadfast.NYPizzaIngredientFactory;
import abstructfactoryheadfast.PizzaIngredientFactory;
import abstructfactoryheadfast.factoryHeadFast.domain.pizza.CheesePizza;
import abstructfactoryheadfast.factoryHeadFast.domain.pizza.ClamPizza;
import abstructfactoryheadfast.factoryHeadFast.domain.pizza.PepperoniPizza;
import abstructfactoryheadfast.factoryHeadFast.domain.pizza.Pizza;
import abstructfactoryheadfast.factoryHeadFast.domain.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingridientFactory = new NYPizzaIngredientFactory();

		if (type.equals("Cheese")) {
			pizza = new CheesePizza(ingridientFactory);
			pizza.setName("New York style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingridientFactory);
			pizza.setName("New York style Pepperoni Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingridientFactory);
			pizza.setName("New York style Clam Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(ingridientFactory);
			pizza.setName("New York style Veggie Pizza");
		}
		return pizza;
	}
}
