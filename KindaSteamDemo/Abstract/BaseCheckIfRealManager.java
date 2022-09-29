package Abstract;

import Entities.User;

public abstract class BaseCheckIfRealManager implements CheckIfRealService{
    @Override
    public boolean checkIfReal(User user) {
        return false;
    }
}
