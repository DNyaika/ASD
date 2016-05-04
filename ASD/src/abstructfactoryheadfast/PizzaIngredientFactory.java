package abstructfactoryheadfast;

import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Cheese;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Clams;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Dough;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Pepperoni;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Sauce;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();

}
