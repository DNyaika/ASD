package builder.builderclassexample.model;

public class Meal {
	private String name;
	private Drink drink;
	private MainDish mainDish;
	private SideDish sideDish;
	
	public Meal(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public MainDish getMainDish() {
		return mainDish;
	}

	public void setMainDish(MainDish mainDish) {
		this.mainDish = mainDish;
	}

	public SideDish getSideDish() {
		return sideDish;
	}

	public void setSideDish(SideDish sideDish) {
		this.sideDish = sideDish;
	}
	
	@Override
	public String toString() {
		return "Meal [name=" + name + ", drink=" + drink + ", mainDish="
				+ mainDish + ", sideDish=" + sideDish + "]";
	}
}
