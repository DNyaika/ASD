package strategy.labSoln;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Flight> flights = Arrays.asList(new Flight(20),new Flight(15),new Flight(12));
		FlightRevenueCalculator flightRevenueCalculator = new FlightRevenueCalculator();
		flightRevenueCalculator.setModel(new MultiClass());
		System.out.println(flightRevenueCalculator.computeRevenue(flights));
	}
}
