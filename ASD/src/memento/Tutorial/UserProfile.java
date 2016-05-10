package memento.Tutorial;

public class UserProfile {
	private String name;
	private String dateofBirth;
	private String address;

	public UserProfile(String name, String dateofBirth, String address) {
		super();
		this.name = name;
		this.dateofBirth = dateofBirth;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public String getAddress() {
		return address;
	}

}
