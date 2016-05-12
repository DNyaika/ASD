package strategy.labSoln;

import java.util.List;

public class SinglePrice implements Model {
	private long totalRevenue;

	@Override
	public double getRevenue(List<Flight> flights) {
		for (Flight flight : flights) {
			totalRevenue += (flight.getPassengers() * baseTicketPrice) - planeFlyCost;
		}

		return totalRevenue;
	}

}
