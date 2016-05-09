package builder.builderLabSolution;

import java.util.HashMap;
import java.util.Map;

import builder.builderLabSolution.model.Customer;



public enum Database {
	DATABASE;
	private Map<String, Customer> customerTable = new HashMap<String, Customer>();

	public Customer SaveCustomer(String phn, Customer customer) {
		customerTable.put(phn, customer);
		return customer;
	}

	public Customer getCustomer(String phn) {
		return customerTable.get(phn);
	}
}
