package abstractfactorylabsolution.model.packaging;

import abstractfactorylabsolution.model.Packaging;

public class HolidaySurpriseWrap implements Packaging {
	private double cost = 0D;

	public HolidaySurpriseWrap(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}
