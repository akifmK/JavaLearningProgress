package regtiretionSystemDemo;

import regtiretionSystemDemo.core.concretes.AlwaysTrueCheckManager;
import regtiretionSystemDemo.core.concretes.GoogleMailAdapter;
import regtiretionSystemDemo.core.concretes.TestCheckManager;
import regtiretionSystemDemo.core.concretes.YandexMailAdapter;
import regtiretionSystemDemo.dataAccess.abstracts.UserDao;
import regtiretionSystemDemo.dataAccess.concretes.AbsUserDao;
import regtiretionSystemDemo.entitites.concretes.User;

public class Main {

	public static void main(String[] args) {                     //REGISTER AND LOGIN SYSTEM//++//REGISTER AND LOGIN SYSTEM//
		User user1 = new User();                           
		user1.setPassword("1ali7771klu");                        //REGISTER AND LOGIN SYSTEM//++//REGISTER AND LOGIN SYSTEM//
		user1.setFirstName("David");
		user1.setLastName("Beckham");                            //REGISTER AND LOGIN SYSTEM//++//REGISTER AND LOGIN SYSTEM//
		user1.setEmail("av.d847@gmail.com");
		
		User user2 = new User();
		user2.setPassword("78sad8");
		user2.setFirstName("Crisitano");
		user2.setLastName("Ronaldp");
		user2.setEmail("ronaldo_Crazy@hotmail.com");
		
		User user3 = new User();
		user3.setPassword("8753966asd7");
		user3.setFirstName("Alex");
		user3.setLastName("Sus");
		user3.setEmail("av.d847@gmail.com");
		
		User user4 = new User();
		user4.setPassword("875");
		user4.setFirstName("Marko");
		user4.setLastName("");
		user4.setEmail("@@dsad@@");
		
		UserDao absDao = new AbsUserDao(new TestCheckManager());  //-With check manager we can set ground rules for user informations
		                                                                              
		System.out.println("----------------------------------"); //For better vision in console
		
		absDao.save(user1);                // -In this example new user can't use a used eMail
		absDao.save(user2);                // password must be longer than 6 chars 
		absDao.save(user3);                // and names must be longer than 2 chars
		absDao.save(user4);                // With error messages user can see what's wrong with his/hers informations.
		
		System.out.println("----------------------------------");
		
		UserDao absDaoAlwaysTrue = new AbsUserDao(new AlwaysTrueCheckManager()); //  -Developer can change the check manager                                        
		absDaoAlwaysTrue.save(user3);                                            // for different situations
		absDaoAlwaysTrue.save(user4);                                            //
		
		System.out.println("----------------------------------");
		
		absDao.userLogin("ronaldo_Crazy@hotmail.com", "78sad8"); //    -User can login the system off-course 
		absDao.userLogin("av.d847@gmail.com", "sada8787ad");     // off-course email and password must be true.
		 
		System.out.println("----------------------------------");
		
		GoogleMailAdapter alexsGoogleAccount = new GoogleMailAdapter();  //  -Also users can sign-up the system 
		YandexMailAdapter pablosYandexAccount = new YandexMailAdapter(); // with their other accounts
		absDao.saveWithEmail(alexsGoogleAccount);                        // (like Google and Yandex)
		absDao.saveWithEmail(pablosYandexAccount);                       //
	
		
		
		
		
		
		
		
			
		
		

	}

}
