public class UserManager {

    public UserManager(){

    }
    public void addToClass(User user,BaseLogger baseLogger){
        System.out.println(user.getFirstName()+" "+user.getLastName()+ " hase been added to class");
        baseLogger.log();
    }
}
