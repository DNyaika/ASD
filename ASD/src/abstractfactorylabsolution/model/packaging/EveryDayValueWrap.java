package abstractfactorylabsolution.model.packaging;

import abstractfactorylabsolution.model.Packaging;

public class EveryDayValueWrap implements Packaging {
	private double cost = 0D;

	public EveryDayValueWrap(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}
