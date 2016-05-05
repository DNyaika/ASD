package flyweightLab;

import java.util.HashMap;

public class CustomerFactory {
	private CustomerFactory() {
	}

	private static final HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();

	public static Customer getCustomer(Integer customerId) {
		Customer customer = (Customer) customers.get(customerId);

		if (customer == null) {
			HealthProfile profile = new HealthProfile("80kg", "50m",
					"05/05/1990");
			Address address = new Address("4000 N ST", "3456", "FairField",
					"Iowa");

			customer = new Customer(2, "George", "White", address, profile,
					null);

			customers.put(customerId, customer);

		}
		return customer;
	}
}
