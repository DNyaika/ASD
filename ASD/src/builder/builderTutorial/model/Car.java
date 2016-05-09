package builder.builderTutorial.model;

public class Car {
	String enginee;
	String paint;
	String tyre;

	public String getEnginee() {
		return enginee;
	}

	public void setEnginee(String enginee) {
		this.enginee = enginee;
	}

	public String getPaint() {
		return paint;
	}

	public void setPaint(String paint) {
		this.paint = paint;
	}

	@Override
	public String toString() {
		return "Car [enginee=" + enginee + ", paint=" + paint + ", tyre="
				+ tyre + "]";
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}
}
