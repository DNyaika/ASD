package flyweightLab;

public class Main {
	public static void main(String... args) {
		Customer customer = CustomerFactory.getCustomer(1);
		customer.viewCustomerDetails(customer.getCustomerId(),
				customer.getFirstName(), customer.getLastName(),
				customer.getResidenceAddress(), customer.getProfile(),
				customer.getLocationMap());
	}
}
