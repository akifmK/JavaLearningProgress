package cafeShop;

public class NeroBuyManager extends BuyManager{

private int _point = 5;
	
public void buy(Customer customer,int amount ) {
	System.out.println("Bought " + amount +" coffes: "+ customer.getFirstName());
	customer.setPoint((customer.getPoint()+ this._point)* amount);
}

}
