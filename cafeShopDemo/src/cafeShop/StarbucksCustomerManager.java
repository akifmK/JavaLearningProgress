package cafeShop;

public class StarbucksCustomerManager extends BaseCustomerManager{

	CheckIfRealManager _checkManager;
	
	public StarbucksCustomerManager(CheckIfRealManager checkManager) {
		
		this._checkManager = checkManager;
	}
	

	@Override
	public  void saveToDatabase(Customer customer) {
		
	
		if(_checkManager.checkIfReal(customer)) {
		System.out.println("Has been saved: " + customer.getFirstName());
		}else {
			System.out.println("Can't save to database : " + customer.getFirstName() + " [reason (age)]");
		}
		
	}

}
