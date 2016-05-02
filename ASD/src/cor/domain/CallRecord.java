package cor.domain;

public class CallRecord {
	private Customer customer;
	private Agent agent;
	private String requestInformation;

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public void setASalesLead(boolean isASalesLead) {
		this.isASalesLead = isASalesLead;
	}

	private boolean isValid;
	private boolean isASalesLead;

	public CallRecord(Customer customer, Agent agent, String requestInformation, boolean isValid,
			boolean isASalesLead) {
		super();
		this.customer = customer;
		this.agent = agent;
		this.requestInformation = requestInformation;
		this.isValid = isValid;
		this.isASalesLead = isASalesLead;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Agent getAgent() {
		return agent;
	}

	public String getRequestInformation() {
		return requestInformation;
	}

	public boolean isValid() {
		return isValid;
	}

	public boolean isASalesLead() {
		return isASalesLead;
	}

	@Override
	public String toString() {
		return "CallRecord [customer=" + customer + ", agent=" + agent + ", requestInformation=" + requestInformation
				+ ", isValid=" + isValid + ", isASalesLead=" + isASalesLead + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agent == null) ? 0 : agent.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + (isASalesLead ? 1231 : 1237);
		result = prime * result + (isValid ? 1231 : 1237);
		result = prime * result + ((requestInformation == null) ? 0 : requestInformation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CallRecord other = (CallRecord) obj;
		if (agent == null) {
			if (other.agent != null)
				return false;
		} else if (!agent.equals(other.agent))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (isASalesLead != other.isASalesLead)
			return false;
		if (isValid != other.isValid)
			return false;
		if (requestInformation == null) {
			if (other.requestInformation != null)
				return false;
		} else if (!requestInformation.equals(other.requestInformation))
			return false;
		return true;
	}
}
