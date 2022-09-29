package Abstract;

import Entities.GameProduct;
import Entities.User;

public interface BuyService {
    void buy(User user, GameProduct gameProduct);
}
