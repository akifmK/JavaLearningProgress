package regtiretionSystemDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import regtiretionSystemDemo.core.abstracts.BaseCheckService;
import regtiretionSystemDemo.databaseDemo.DatabaseDemo;
import regtiretionSystemDemo.entitites.concretes.User;

public class TestCheckManager implements BaseCheckService {

	DatabaseDemo database = new DatabaseDemo();

	@Override
	public boolean isUsable(User user) {
		if (isEmailUsable(user) && isPasswordUsable(user) && isFirstNameUsable(user) && isLastNameUsable(user)
				&& !isEmailUsed(user)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isPasswordUsable(User user) {
		if (6 <= user.getPassword().length()) {
			return true;
		} else {
			System.out.print("Password must have 6 characters at least!!" + "  ");
			return false;
		}
	}

	private boolean isEmailUsable(User user) {
		String emailRedex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
				+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		Pattern emailPat = Pattern.compile(emailRedex);
		Matcher matcher = emailPat.matcher(user.getEmail());

		return matcher.find();

	}

	private boolean isFirstNameUsable(User user) {
		if (2 <= user.getFirstName().length()) {
			return true;
		} else {
			System.out.print("First name must be longer than 2 characters!!" + "  ");
			return false;
		}
	}

	private boolean isLastNameUsable(User user) {
		if (2 <= user.getLastName().length()) {
			return true;
		} else {
			System.out.print("Last name must be longer than 2 characters!!" + "  ");
			return false;
		}
	}

	private boolean isEmailUsed(User user) {

		for (String userInfo : database.getList()) {
			if (userInfo.contains(user.getEmail())) {
				System.out.print("This Email has been taken!!" + "  ");
				return true;
			}
		}
		return false;

	}

}
