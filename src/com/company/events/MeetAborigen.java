package com.company.events;

import com.company.homework28.Sailor;

import java.util.Random;

public class MeetAborigen implements Event{
    @Override
    public void makeEvent(Sailor sailor) {
        Random random = new Random();
        int randomAborigenLigs = random.nextInt(3) + 4;
        sailor.setSpeed(randomAborigenLigs);
        System.out.println("Today you met aborigen and get your way shorter for: " + randomAborigenLigs);
    }
}
