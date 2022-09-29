package cafeShop;

public class ACheckManager extends CheckIfRealManager{
	
	@Override
	public boolean checkIfReal(Customer customer) {
		
		if(customer.getAge()<18) {
			return false;
		}else {
			return true;
		}
		
		
	}

}
