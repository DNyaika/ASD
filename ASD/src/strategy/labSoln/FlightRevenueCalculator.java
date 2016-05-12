package strategy.labSoln;

import java.util.List;

public class FlightRevenueCalculator {
	private Model model;

	public void setModel(Model model) {
		this.model = model;
	}

	public double computeRevenue(List<Flight> flights) {
		return model.getRevenue(flights);
	}
}
