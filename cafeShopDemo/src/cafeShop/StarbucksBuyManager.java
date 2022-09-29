package cafeShop;

public class StarbucksBuyManager extends BuyManager{
	
	private int _point = 1;
	
	public void buy(Customer customer,int amount ) {
		System.out.println("Bought "+ amount + " coffes: "+ customer.getFirstName());
		customer.setPoint((customer.getPoint()+ this._point)* amount);
	}

}
