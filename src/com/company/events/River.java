package com.company.events;

import com.company.homework28.Sailor;

public class River implements Event{

    @Override
    public void makeEvent(Sailor sailor) {
        sailor.setSpeed(0);
        System.out.println("You met river on your way, your speed is 0 today");
    }
}
