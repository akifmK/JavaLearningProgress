package regtiretionSystemDemo.dataAccess.abstracts;


import regtiretionSystemDemo.core.abstracts.EmailService;
import regtiretionSystemDemo.entitites.concretes.User;

public interface UserDao {

	void save(User user);
	void saveWithEmail(EmailService eMail);
	void userLogin(String eMail ,String password);
}
