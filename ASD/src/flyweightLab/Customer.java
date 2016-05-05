package flyweightLab;

import java.awt.Image;

public class Customer implements FlyWeight {
	private int customerId;
	private String firstName;
	private String lastName;
	private Address residenceAddress;
	private HealthProfile profile;
	// city map with a red dot representing residence location
	private Image locationMap;

	public Customer(int customerId, String firstName, String lastName,
			Address residenceAddress, HealthProfile profile, Image locationMap) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.residenceAddress = residenceAddress;
		this.profile = profile;
		this.locationMap = locationMap;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getResidenceAddress() {
		return residenceAddress;
	}

	public HealthProfile getProfile() {
		return profile;
	}

	public Image getLocationMap() {
		return locationMap;
	}

	@Override
	public void viewCustomerDetails(int customerId, String firstName,
			String lastName, Address residenceAddress, HealthProfile profile,
			Image locationMap) {
		System.out.println("firstName::: " + firstName);
		System.out.println("lastName::: " + lastName);
		System.out.println("Profile::::   " + profile);
		System.out.println("Address::::   " + residenceAddress);

	}
}
