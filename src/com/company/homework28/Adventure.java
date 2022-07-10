package com.company.homework28;

import java.util.Random;

public class Adventure {



    public int addRandomLigs() {
        Random random = new Random();
        int randomLigs = random.nextInt(50) + 51;
        return randomLigs;
    }

}
