package com.company;

import java.util.Random;

public enum City {
    NEW_YORK,
    BISHKEK
    ;

    private int distance;

    City() {
        this.distance = new Random().nextInt(50) + 51;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
