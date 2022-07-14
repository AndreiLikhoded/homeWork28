package com.company.events;

import com.company.homework28.Goods;
import com.company.homework28.Quality;
import com.company.homework28.Sailor;

import java.util.Random;

public class GoodGotBad implements Event{
    private final static Random RANDOM = new Random();
    @Override
    public void makeEvent(Sailor sailor) {
        Goods goods = Goods.values()[RANDOM.nextInt(Goods.values().length)];



        Quality quality = Quality.values()[RANDOM.nextInt(Quality.values().length)];


    }
}
