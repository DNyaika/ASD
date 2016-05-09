package abstractfactorylabsolution.model.packaging;

import abstractfactorylabsolution.model.Packaging;

public class HappyKidGiftWrap implements Packaging {
	private double cost = 0D;

	public HappyKidGiftWrap(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}
