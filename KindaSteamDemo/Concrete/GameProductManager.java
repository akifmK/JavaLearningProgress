package Concrete;

import Abstract.BaseProductManager;
import Entities.GameProduct;
import Entities.User;

public class GameProductManager extends BaseProductManager {

    @Override
    public void buy(User user, GameProduct gameProduct) {
        if(gameProduct.getPrice() <= user.getBalance()) {
            super.buy(user, gameProduct);
            user.setBalance(user.getBalance()-gameProduct.getPrice());
        }else{
            System.out.println(user.getFirstName() + " can not buy " + gameProduct.getName());
        }
    }
}
