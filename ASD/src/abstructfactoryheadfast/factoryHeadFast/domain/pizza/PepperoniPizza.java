package abstructfactoryheadfast.factoryHeadFast.domain.pizza;

import abstructfactoryheadfast.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingridientFactory;

	public PepperoniPizza(PizzaIngredientFactory ingridientFactory) {
		this.ingridientFactory = ingridientFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingridientFactory.createDough();
		sauce = ingridientFactory.createSauce();
		cheese = ingridientFactory.createCheese();
		clam = ingridientFactory.createClam();
	}

}
