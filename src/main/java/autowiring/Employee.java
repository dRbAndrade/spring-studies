package autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
	

}
