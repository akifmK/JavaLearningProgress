import Abstract.BaseCampaignManager;
import Abstract.BaseUserManager;
import Concrete.*;
import Entities.GameProduct;
import Entities.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();        //
        User user2 = new User();        //
        user1.setFirstName("Jack");     // - User creation
        user1.setBirthYear("2023");     // - User creation
        user1.setBalance(300.00);       //
        user2.setFirstName("Daniel");   //

        System.out.println("----------------------------------------------"); //For better console vision//

        BaseUserManager userManager = new UserManager(new CheckRealManagerA()); //  -During the save progress it is checked whether
        userManager.saveUser(user1);                                            //  the user real or not(with check managers).
        userManager.deleteUser(user2);                                          //  Also users can be deleted.

        System.out.println("----------------------------------------------");

        GameProduct game1 = new GameProduct(); //
        GameProduct game2 = new GameProduct(); //
        game1.setName("RDR2");                 // - Game product creation.
        game1.setPrice(246.84);                // - Game product creation.
        game2.setPrice(58.37);                 //
        game2.setName("CS-GO");                //

        System.out.println("----------------------------------------------");

        System.out.println(user1.getFirstName()+"'s money: " + user1.getBalance()); //
                                                                                    //   -In this case if user has
        GameProductManager gameProductManager = new GameProductManager();           //  enough money for buying game
        gameProductManager.buy(user1,game1);                                        //  he can buy and his balance will
        gameProductManager.buy(user1,game2);                                        //  decrease. Off-course you cant buy
                                                                                    //  the game if the price is high
        System.out.println(user1.getFirstName()+"'s money: " + user1.getBalance()); //  for your balance.

        System.out.println("----------------------------------------------"); 


        BaseCampaignManager campaign1 = new CampaignManager("Winter Fall",
                "The games valid in the campaign are 50% off");             //
        System.out.println("Game price before campaign " + game2.getPrice());        //  -Campaign's can chance
        campaign1.discountRateAndGame(0.4, game2);                        //   prices of games.
        System.out.println("Game price after campaign " + game2.getPrice());         //






    }
}
