package abstractfactorylabsolution.model.packaging;

import abstractfactorylabsolution.model.Packaging;

public class PlainPaperBox implements Packaging {

	private double cost = 0D;

	public PlainPaperBox(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

}
