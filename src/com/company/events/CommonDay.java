package com.company.events;

import com.company.homework28.Sailor;

public class CommonDay implements Event{
    @Override
    public void makeEvent(Sailor sailor) {
        System.out.println("Common speed in a common day!");
    }
}
