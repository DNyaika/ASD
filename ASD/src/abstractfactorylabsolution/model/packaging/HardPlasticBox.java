package abstractfactorylabsolution.model.packaging;

import abstractfactorylabsolution.model.Packaging;

public class HardPlasticBox implements Packaging {
	private double cost = 0D;

	public HardPlasticBox(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

}
