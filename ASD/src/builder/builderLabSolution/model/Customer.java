package builder.builderLabSolution.model;

public class Customer {
	String name;
	String dob;
	String email;

	public Customer(String name, String dob, String email) {
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", dob=" + dob + ", email=" + email
				+ "]";
	}
}
