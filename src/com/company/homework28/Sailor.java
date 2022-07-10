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
        } else if (speed > 6) {
            this.speed = 6;
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


    public void randomAdventure() {
        Adventure[] city = new Adventure[5];
        Random random = new Random();
        int r = new Random().nextInt(5);
        for (int i = 0; i < city.length; i++) {
            int randomLigs = addRandomLigs();
            switch (r) {
                case 0:
                    city[i] = new Moscow("Moscow", randomLigs);
                    break;
                case 1:
                    city[i] = new Krasnogorsk("Krasnogorsk", randomLigs);
                    break;
                case 2:
                    city[i] = new Bishkek("Bishkek", randomLigs);
                    break;
                case 3:
                    city[i] = new Osh("Osh", randomLigs);
                    break;
                case 4:
                    city[i] = new NewYork("NewYork", randomLigs);
                    break;
            }
        }
    }

    public int addRandomLigs() {
        Random random = new Random();
        int randomLig = random.nextInt(50) + 51;
        return randomLig;
    }

}
