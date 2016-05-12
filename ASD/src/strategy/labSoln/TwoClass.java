package strategy.labSoln;

import java.util.List;

public class TwoClass implements Model {
	private double totalRevenue;

	@Override
	public double getRevenue(List<Flight> flights) {
		double newfixedprice = (planeFlyCost * 1.1) + planeFlyCost;
		double businessClassTotalCost = 0;
		double coachClassTotalCost = 0;
		double firstClassPassengers = 0;
		double businessClassPassengers = 0;
		double coachClassPassengers = 0;
		double remainingPassengers = 0;
		for (Flight flight : flights) {
			businessClassPassengers = flight.getPassengers()*(1/3);
			businessClassTotalCost = (baseTicketPrice * 1.5) * businessClassPassengers;
			remainingPassengers = firstClassPassengers - businessClassPassengers;
			coachClassPassengers = remainingPassengers * (2/3);
			coachClassTotalCost = (baseTicketPrice * 0.75) * coachClassPassengers;
			totalRevenue += (coachClassTotalCost + businessClassTotalCost ) - newfixedprice;
		}
		return totalRevenue;
	}

}
