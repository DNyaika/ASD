package builder.builderclassexample;

import builder.builderclassexample.model.Meal;

public interface MealBuilder {
	public void buildDrink();

	public void buildMainDish();

	public void buildSideDish();

	public Meal getMeal();
}
