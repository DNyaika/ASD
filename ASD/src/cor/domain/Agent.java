package cor.domain;

public class Agent {
	private String agentId;
	private Address workLocation;

	public Agent(String agentId, Address workLocation) {
		super();
		this.agentId = agentId;
		this.workLocation = workLocation;
	}

	public String getAgentId() {
		return agentId;
	}

	public Address getWorkLocation() {
		return workLocation;
	}

	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", workLocation=" + workLocation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agentId == null) ? 0 : agentId.hashCode());
		result = prime * result + ((workLocation == null) ? 0 : workLocation.hashCode());
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
		Agent other = (Agent) obj;
		if (agentId == null) {
			if (other.agentId != null)
				return false;
		} else if (!agentId.equals(other.agentId))
			return false;
		if (workLocation == null) {
			if (other.workLocation != null)
				return false;
		} else if (!workLocation.equals(other.workLocation))
			return false;
		return true;
	}

}
