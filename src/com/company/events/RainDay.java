package com.company.events;

import com.company.homework28.Goods;
import com.company.homework28.Main;
import com.company.homework28.Sailor;

public class RainDay implements Event {
    @Override
    public void makeEvent(Sailor sailor) {
        sailor.setSpeed(sailor.getSpeed() - 2);
        Goods goods = sailor.products.get(0);
        goods.setQuality(Main.getNeedQ(goods.getQuality()));
        //30%
    }

}
