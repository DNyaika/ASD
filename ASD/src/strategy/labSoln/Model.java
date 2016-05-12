package strategy.labSoln;

import java.util.List;

public interface Model {
	public double getRevenue(List<Flight> flights);

	double baseTicketPrice = 300;
	double planeFlyCost = 50000;
}
