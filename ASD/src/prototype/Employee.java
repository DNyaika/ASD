package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class Employee implements Cloneable, Serializable {
	private int id;
	private String Lastname;
	private String Firstname;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	private Employee supervisor;
	private Employee staff[];

	public Employee(int id, String lastname, String firstname, String streetAddress, String city, String state,
			String zipcode) {
		super();
		this.id = id;
		Lastname = lastname;
		Firstname = firstname;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.supervisor = supervisor;
		this.staff = staff;
	}

	public Employee(Employee supervisor, Employee[] staff) {
		super();
		this.supervisor = supervisor;
		this.staff = staff;
	}

	public int getId() {
		return id;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public void setStaff(Employee[] staff) {
		this.staff = staff;
	}

	public String getLastname() {
		return Lastname;
	}

	public String getFirstname() {
		return Firstname;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public Employee[] getStaff() {
		return staff;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		if (supervisor != null) {
			employee.supervisor = (Employee) supervisor.doclone();
		}
		int size = staff.length;
		for (int i = 0; i < size; ++i) {
			employee.staff[i] = (Employee) staff[i].doclone();
		}
		return employee;
	}

	protected Object doclone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Lastname=" + Lastname + ", Firstname=" + Firstname + ", streetAddress="
				+ streetAddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", supervisor="
				+ supervisor + ", staff=" + Arrays.toString(staff) + "]";
	}

	// @SuppressWarnings("unchecked")
	// public static<T> T clone(T t) throws Exception {
	// //Check if T is instance of Serializeble other throw
	// CloneNotSupportedException
	// ByteArrayOutputStream bos = new ByteArrayOutputStream();
	//
	// //Serialize it
	// serializeToOutputStream(t, bos);
	//
	// byte[] bytes = bos.toByteArray();
	// ObjectInputStream ois = new ObjectInputStream(new
	// ByteArrayInputStream(bytes));
	//
	// //Deserialize it and return the new instance
	// return (T)ois.readObject();
	// }
}
