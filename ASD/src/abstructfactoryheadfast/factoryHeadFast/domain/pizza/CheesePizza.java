package abstructfactoryheadfast.factoryHeadFast.domain.pizza;

import abstructfactoryheadfast.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingridientFactory;

	public CheesePizza(PizzaIngredientFactory ingridientFactory) {
		this.ingridientFactory = ingridientFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingridientFactory.createDough();
		sauce = ingridientFactory.createSauce();
		cheese = ingridientFactory.createCheese();
	}
}
