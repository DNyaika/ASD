package strategy.labSoln;

import java.util.List;

public class MultiClass implements Model {
	private double totalRevenue;

	@Override
	public double getRevenue(List<Flight> flights) {
		double newfixedprice = (planeFlyCost * 1.2) + planeFlyCost;
		double firstClassTotalCost = 0;
		double businessClassTotalCost = 0;
		double coachClassTotalCost = 0;
		double firstClassPassengers = 0;
		double businessClassPassengers = 0;
		double coachClassPassengers = 0;
		double remainingPassengers = 0;
		for (Flight flight : flights) {
			firstClassPassengers = flight.getPassengers() * (1 / 10);
			firstClassTotalCost = (baseTicketPrice * 4) * firstClassPassengers;
			remainingPassengers = flight.getPassengers() - firstClassPassengers;
			businessClassPassengers = (remainingPassengers * 0.5);
			businessClassTotalCost = (baseTicketPrice * 1.5) * businessClassPassengers;
			remainingPassengers = remainingPassengers - businessClassPassengers;
			coachClassPassengers = remainingPassengers * 0.7;
			coachClassTotalCost = (baseTicketPrice * 0.75) * coachClassPassengers;
			totalRevenue += (coachClassTotalCost + businessClassTotalCost + firstClassTotalCost) - newfixedprice;
		}
		return totalRevenue;
	}

}
