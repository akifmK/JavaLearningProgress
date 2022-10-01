package regtiretionSystemDemo.databaseDemo;

import java.util.ArrayList;

import regtiretionSystemDemo.entitites.concretes.User;

public class DatabaseDemo {

	public static ArrayList<String> userInfo = new ArrayList<String>();
	
	public void addToDb(User user) {
		userInfo.add(user.getEmail()+user.getPassword());
		
	}
	
	public boolean existInDb(String eMailAndPassword) {
		boolean isExist = false;
		for(String info:userInfo) {
			if(info.equals(eMailAndPassword)) {
				isExist=  true;
			}
		  }
		return isExist;
		}
		
	public ArrayList<String> getList() {
		return this.userInfo;
	}
		
	
}
