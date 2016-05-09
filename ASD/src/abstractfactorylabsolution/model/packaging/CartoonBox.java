package abstractfactorylabsolution.model.packaging;

import abstractfactorylabsolution.model.Packaging;

public class CartoonBox implements Packaging {
	private double cost = 0D;



	public CartoonBox(double cost) {
		this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}
	
}
