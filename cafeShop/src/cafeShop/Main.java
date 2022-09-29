package cafeShop;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		
		customer1.setFirstName("David");
		customer1.setAge(19);
		
		customer2.setFirstName("Mike");
		customer2.setAge(35);
		
		customer3.setFirstName("Helly");
		customer3.setAge(8);
		
		
		BaseCustomerManager starManager = new StarbucksCustomerManager(new ACheckManager());
		BaseCustomerManager neroManager = new StarbucksCustomerManager(new BCheckManager());
		
		starManager.saveToDatabase(customer1);
		starManager.saveToDatabase(customer3);
		neroManager.saveToDatabase(customer2);
		
		BuyManager starBuyManager = new StarbucksBuyManager();
		BuyManager neroBuyManager = new NeroBuyManager();
		
		starBuyManager.buy(customer1,1);
		neroBuyManager.buy(customer2,1);
		
		System.out.println(customer1.getFirstName() + "'s point: " + customer1.getPoint());
		System.out.println(customer2.getFirstName() + "'s point: " + customer2.getPoint());
		
		starBuyManager.buy(customer1,10);
		neroBuyManager.buy(customer2,10);
		
		System.out.println(customer1.getFirstName() + "'s point: " + customer1.getPoint());
		System.out.println(customer2.getFirstName() + "'s point: " + customer2.getPoint());
		



	}

}
