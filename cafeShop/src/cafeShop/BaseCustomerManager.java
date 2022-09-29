package cafeShop;

public abstract class BaseCustomerManager implements ICustomerSaveService {
 
	
	public void saveToDatabase(Customer customer) {
		System.out.println("Has been saved: " + customer.getFirstName());
		
	}

}
