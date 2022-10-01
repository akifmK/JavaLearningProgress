package regtiretionSystemDemo.dataAccess.concretes;

import regtiretionSystemDemo.core.abstracts.BaseCheckService;
import regtiretionSystemDemo.core.abstracts.EmailService;
import regtiretionSystemDemo.dataAccess.abstracts.UserDao;
import regtiretionSystemDemo.databaseDemo.DatabaseDemo;
import regtiretionSystemDemo.entitites.concretes.User;

public class AbsUserDao implements UserDao{

	DatabaseDemo databaseDemo = new DatabaseDemo();
	private BaseCheckService checkManager;
	
	public AbsUserDao(BaseCheckService checkManager ) {
		this.checkManager = checkManager;
		
	}
	
	
	@Override
	public void save(User user) {
	
		if(checkManager.isUsable(user)) {
			System.out.println("User has been saved with AbsDao: " + user.getFirstName());
			databaseDemo.addToDb(user);
		}else {
			System.out.println("User couldn't saved");
		}
		
	}
	
	@Override
	public void saveWithEmail(EmailService eMail) {
		System.out.println("User has been saved with AbsDao: " + eMail.Mail());
	}
	

	@Override
	public void userLogin(String eMail ,String password) {
		if(databaseDemo.existInDb(eMail+password)) {
			System.out.println("User entered the system.");
		}else {
			System.out.println("Wrong Email or Password!!");
		}
		
	}
	
	

	


}
