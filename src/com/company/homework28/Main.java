package com.company.homework28;

import com.company.events.*;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        run();
    }
    public static void run(){
        Sailor sailor = new Sailor();
        sailor.randomLoad();
        Event[] events = {
                new BreakWheel(),
                new CommonDay(),
                new GoodGotBad(),
                new GoodRoad(),
                new MeetAborigen(),
                new River(),
                new Tractir(),
                new Robers(),
                new RainDay()
        };
        Random random = new Random();
        int r = random.nextInt(8);
        events[r].makeEvent(sailor);
    }
}
