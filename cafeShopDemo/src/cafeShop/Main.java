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
		
		
		BaseCustomerManager starManager = new StarbucksCustomerManager(new ACheckManager());   // Checking for the customer is real person or not.
		BaseCustomerManager neroManager = new StarbucksCustomerManager(new BCheckManager());   // With check managers we can use the manager we want.
		
		starManager.saveToDatabase(customer1);   //
		starManager.saveToDatabase(customer3);   // -If the customer is not a real person the system not let in for saving to databases.
		neroManager.saveToDatabase(customer2);   //
		
		BuyManager starBuyManager = new StarbucksBuyManager();           //   
		BuyManager neroBuyManager = new NeroBuyManager();                //   -Different brands has different buy methods  
		                                                                 //  thats mean different buy managers.
		starBuyManager.buy(customer1,1);
		neroBuyManager.buy(customer2,1);
		
		System.out.println(customer1.getFirstName() + "'s point: " + customer1.getPoint());      //
		System.out.println(customer2.getFirstName() + "'s point: " + customer2.getPoint());      //
		                                                                                         //  -Brands can create their own campaigns.
 		starBuyManager.buy(customer1,10);                                                        // Lets take a look to the sample. Customers bought 
		neroBuyManager.buy(customer2,10);                                                        // same numbers of coffee but customer2 gain more points.
		                                                                                         //
		System.out.println(customer1.getFirstName() + "'s point: " + customer1.getPoint());      //
		System.out.println(customer2.getFirstName() + "'s point: " + customer2.getPoint());      //
		



	}

}
