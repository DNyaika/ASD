package flyweightLab;

public class Address {
	private String street;
	private String zip;
	private String city;
	private String state;

	public Address(String street, String zip, String city, String state) {
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public String getZip() {
		return zip;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zip=" + zip + ", city=" + city
				+ ", state=" + state + "]";
	}
}
