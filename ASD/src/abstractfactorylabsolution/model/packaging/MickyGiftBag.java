package abstractfactorylabsolution.model.packaging;

import abstractfactorylabsolution.model.Packaging;

public class MickyGiftBag implements Packaging {
	private double cost = 0D;

	public MickyGiftBag(Double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}
