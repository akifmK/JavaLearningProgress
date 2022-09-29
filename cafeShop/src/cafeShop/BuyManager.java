package cafeShop;

public class BuyManager implements IBuyService{

	@Override
	public void buy(Customer customer, int amount) {
		System.out.println("Bought a coffe: "+ customer.getFirstName());		
	}

}
