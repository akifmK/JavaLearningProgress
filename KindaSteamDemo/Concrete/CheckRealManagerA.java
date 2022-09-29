package Concrete;

import Abstract.BaseCheckIfRealManager;
import Entities.User;

public class CheckRealManagerA extends BaseCheckIfRealManager {

    @Override
    public boolean checkIfReal(User user) {
        if(user.getBirthYear()==null){
            return false;
        }else{
            return true;
        }
    }
}
