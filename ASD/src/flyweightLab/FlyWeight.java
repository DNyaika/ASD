package flyweightLab;

import java.awt.Image;

public interface FlyWeight {
	public void viewCustomerDetails(int customerId,String firstName,String lastName,Address residenceAddress, HealthProfile profile,Image locationMap);
}
