package com.company.homework28;

import com.company.events.*;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        run();
    }
    public static void run(){
        Adventure adventure = new Adventure();
        adventure.addRandomLigs();
        MakeAdventure[] makeAdventures = {
                new NewYork(),
                new Moscow(),
                new Bishkek(),
                new Krasnogorsk(),
                new Texas()
        };
        Random random = new Random();
        int ran = random.nextInt(4);
        makeAdventures[ran] = makeAdventures(makeAdventures);
        System.out.println(makeAdventures[ran]);

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
        Random random1 = new Random();
        int r = random.nextInt(8);
        events[r].makeEvent(sailor);
        System.out.println(events[r]);
    }

    private static MakeAdventure makeAdventures(MakeAdventure[] makeAdventures) {
        return makeAdventures[0];
    }
}
