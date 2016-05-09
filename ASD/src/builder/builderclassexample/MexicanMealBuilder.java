package builder.builderclassexample;

import builder.builderclassexample.model.Drink;
import builder.builderclassexample.model.MainDish;
import builder.builderclassexample.model.Meal;
import builder.builderclassexample.model.SideDish;

public class MexicanMealBuilder implements MealBuilder {

	private Meal meal;

	public MexicanMealBuilder() {
		meal = new Meal("Tequila Set");
	}

	@Override
	public void buildDrink() {
		Drink drink = new Drink("Tequila");
		meal.setDrink(drink);
	}

	@Override
	public void buildMainDish() {
		MainDish main = new MainDish("Tortas");
		meal.setMainDish(main);
	}

	@Override
	public void buildSideDish() {
		SideDish side = new SideDish("Arroz con leche");
		meal.setSideDish(side);
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
}
