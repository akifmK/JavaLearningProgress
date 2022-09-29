package Abstract;

import Entities.User;

public abstract class BaseUserManager implements UserDeleteService,UserSaveService{

    @Override
    public void deleteUser(User user){
        System.out.println("User has been deleted: " + user.getFirstName());
    }

    public void saveUser(User user){
        System.out.println("User has been saved: " + user.getFirstName());
    }
}
