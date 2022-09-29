package Concrete;

import Abstract.BaseCheckIfRealManager;
import Entities.User;

public class CheckRealManagerB extends BaseCheckIfRealManager {

    @Override
    public boolean checkIfReal(User user) {
        return true;
    }
}
