package com.company.events;

import com.company.homework28.Sailor;

public class GoodRoad implements Event{
    @Override
    public void makeEvent(Sailor sailor) {
        sailor.setSpeed(sailor.getSpeed() + 2);
        System.out.println("Good road + 2 ligs to a common speed!e");
    }
}
