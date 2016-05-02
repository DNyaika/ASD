package cor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import cor.Validator;
import cor.domain.Address;
import cor.domain.Agent;
import cor.domain.CallRecord;
import cor.domain.Customer;

public class Main {

	public static void main(String[] args) {
		CallRecord callRecord1 = new CallRecord(createCustomer(), createAgent(), "blablabla", false, false);
		CallRecord callRecord2 = new CallRecord(createCustomer(), createAgent(), "blablabla", false, false);
		List<CallRecord> callRecords = Arrays.asList(callRecord1, callRecord2);
		Validator validator = new Validator();
		for (CallRecord record : callRecords) {
			validator.handleRequest(record);
		}
	}

	public static Customer createCustomer() {
		List<Customer> customers = new ArrayList<>();
		Address address1 = new Address("4th street", "FF", "IA", "34567");
		Address address2 = new Address("5th street", "ILL", "CA", "5555");

		Customer customer1 = new Customer("David", "Nyaika", address1, "33455454545", "google@gmail.com");
		Customer customer2 = new Customer("Ashraf", "Elsayed", address2, "56586896763", "yahoo@yahoo.com");
		customers.add(customer1);
		customers.add(customer2);
		return customers.get(0);
	}

	public static Agent createAgent() {
		List<Agent> agents = new ArrayList<>();
		Address address1 = new Address("4th street", "FF", "IA", "34567");
		Address address2 = new Address("5th street", "ILL", "CA", "5555");

		Agent agent1 = new Agent("22", address1);
		Agent agent2 = new Agent("12", address2);

		agents.add(agent1);
		agents.add(agent2);

		return agents.get(0);
	}

}
