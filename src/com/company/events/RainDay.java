package com.company.events;

import com.company.homework28.Sailor;

public class RainDay implements Event {
    @Override
    public void makeEvent(Sailor sailor) {
        sailor.setSpeed(sailor.getSpeed() - 2);

        //30%
    }
}
