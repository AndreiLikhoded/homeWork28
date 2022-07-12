package com.company.homework28;

import com.company.City;
import com.company.events.*;

import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();

    public static void main(String[] args){

        run();
    }
    public static void run(){
        City city = City.values()[RANDOM.nextInt(City.values().length)];
        System.out.println(city);
        System.out.println(city.getDistance());

        Sailor sailor = new Sailor();
        sailor.randomLoad();
        Event[] events = createEvents();
        int day = 1;
        while (city.getDistance() > 0){
            System.out.println("DAY " + day);
            System.out.println("" + city.getDistance());
            Event event = events[RANDOM.nextInt(events.length)];
            event.makeEvent(sailor);
            city.setDistance(city.getDistance() - sailor.getSpeed());
            day++;
            sailor.setSpeed(3);
        }
    }

    private static Event[] createEvents() {
        return new Event[] {
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
    }

    private static MakeAdventure makeAdventures(MakeAdventure[] makeAdventures) {
        return makeAdventures[0];
    }

    public static Quality getNeedQ(Quality quality){
        Quality[] values = Quality.values();
        for (int i = 0; i < values.length; i++){
            if(values[i] == quality && i < values.length - 1){
                return values[i + 1];
            }else {
                return values[values.length - 1];
            }
        }
        return null;
    }
}
