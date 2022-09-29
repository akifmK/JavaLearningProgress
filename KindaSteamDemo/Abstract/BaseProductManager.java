package Abstract;

import Entities.GameProduct;
import Entities.User;

public abstract class BaseProductManager implements BuyService{

    @Override
    public void buy(User user, GameProduct gameProduct) {
        System.out.println(user.getFirstName() + " named user got game: " + gameProduct.getName());
    }
}
