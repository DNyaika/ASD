package abstractfactorylabsolution.model.packaging;

import abstractfactorylabsolution.model.Packaging;

public class MerchantCollectionBag implements Packaging {
	private double cost = 0D;

	public MerchantCollectionBag(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}
