package com.company.events;

import com.company.homework28.Sailor;

public class BreakWheel implements Event{
    @Override
    public void makeEvent(Sailor sailor) {
        sailor.setSpeed(0);
        System.out.println("Broken wheel, your speed is 0 today");
    }
}
