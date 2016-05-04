package abstructfactoryheadfast;

import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Cheese;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Clams;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Dough;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Pepperoni;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Sauce;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.Veggies;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.ny.FreshClams;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.ny.MarinaraSauce;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.ny.ReggianoCheese;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.ny.SlicedPepperoni;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.ny.ThinCrustDough;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.veggies.Garlic;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.veggies.Mushroom;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.veggies.Onion;
import abstructfactoryheadfast.factoryHeadFast.domain.ingridient.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {

		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[]={new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {

		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams() ;
	}

}
