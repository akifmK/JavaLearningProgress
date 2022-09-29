package Concrete;

import Abstract.BaseCheckIfRealManager;
import Abstract.BaseUserManager;
import Entities.User;

public class UserManager extends BaseUserManager {

    BaseCheckIfRealManager checkManager;

    public UserManager(BaseCheckIfRealManager checkIfRealManager){
        this.checkManager = checkIfRealManager;
    }

    @Override
    public void saveUser(User user) {
        if(checkManager.checkIfReal(user)){
            super.saveUser(user);
        }else{
            System.out.println("can not saved");
        }
    }


}
