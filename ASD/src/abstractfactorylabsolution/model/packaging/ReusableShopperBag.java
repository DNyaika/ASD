package abstractfactorylabsolution.model.packaging;

import abstractfactorylabsolution.model.Packaging;

public class ReusableShopperBag implements Packaging {
	private double cost = 0D;

	public ReusableShopperBag(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}
