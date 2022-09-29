package Concrete;

import Abstract.BaseCampaignManager;
import Entities.GameProduct;

public class CampaignManager extends BaseCampaignManager {



    public CampaignManager(String name, String explanation){}


    @Override
    public void discountRateAndGame(double discountRate , GameProduct gameProduct) {
        gameProduct.setPrice(gameProduct.getPrice() * discountRate);
    }
}
