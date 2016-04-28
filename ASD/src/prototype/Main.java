package prototype;

import java.util.Arrays;

public class Main {
	public static void main(String[] arg) throws CloneNotSupportedException {
		Employee emp2 = new Employee(0, "james", "saw", "blablabla", "Fairfield", "IOWA", "55555");

		Employee emp = new Employee(0, "David", "John", "blablabla", "Fairfield", "IOWA", "55555");

		Employee[] staff = { emp2 };

		emp.setSupervisor(emp2);
		emp.setStaff(staff);

		// Employee employee = (Employee) emp.doclone();
		// employee.getSupervisor().setFirstname("lalalalalalalalala");
		// employee.getSupervisor().setLastname("lalalalalalalalala");

		System.out.println(emp.toString());
	}
}
