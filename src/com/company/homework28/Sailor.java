package com.company.homework28;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sailor {

    private int speed = 3;

    private int loadCapacity = 600;

    private double sumOfMoney = 1000;


    List<Goods> products;

    public Sailor() {
        products = new ArrayList<>();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else if (speed > 5) {
            this.speed = 5;
        } else this.speed = speed;
    }

    public void randomLoad() {
        Random random = new Random();
        var g = Goods.values();
        while (sumOfMoney > 200 || loadCapacity > 0) {
            int r = random.nextInt(5);

            products.add(g[r]);
            sumOfMoney -= g[r].getPrice();
            if (loadCapacity - g[r].getWeightOfGood() < 0) {
                loadCapacity = 0;
            } else
                loadCapacity -= g[r].getWeightOfGood();
        }
    }
}
