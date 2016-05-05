package flyweightLab;

public class HealthProfile {
	private String weight;
	private String height;
	private String dob;

	public HealthProfile(String weight, String height, String dob) {
		super();
		this.weight = weight;
		this.height = height;
		this.dob = dob;
	}

	public String getWeight() {
		return weight;
	}

	public String getHeight() {
		return height;
	}

	public String getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "HealthProfile [weight=" + weight + ", height=" + height
				+ ", dob=" + dob + "]";
	}
}
