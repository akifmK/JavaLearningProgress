package cafeShop;

public class BCheckManager extends CheckIfRealManager {
	
public boolean checkIfReal(Customer customer) {
		
		if(customer.getAge()<30) {
			return false;
		}else {
			return true;
		}
		
		
	}

}
