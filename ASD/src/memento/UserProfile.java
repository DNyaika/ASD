package memento;

public class UserProfile {
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;

	public UserProfile(String name, String street, String city, String state,
			String zip) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	@Override
	public String toString() {
		return "UserProfile [name=" + name + ", street=" + street + ", city="
				+ city + ", state=" + state + ", zip=" + zip + "]";
	}
}
