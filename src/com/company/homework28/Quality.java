package com.company.homework28;

public enum Quality {
    A1(1.2),
    A2(0.95),
    A3(0.55),
    A4(0.25),
    A5(-0.1);

    private final double q;

    public double getQ() {
        return q;
    }

    Quality(double q) {
        this.q = q;
    }
}
