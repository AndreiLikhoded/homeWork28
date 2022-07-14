package com.company.homework28;

public enum Quality {
    NORMAL(1.2),
    SLIGHTLY_SPOILED(0.95),
    HALF_OF_IT_HAS_GON_BAD(0.55),
    ALMOST_ALL_GONE_BAD(0.25),
    SPOILED_INTO_TRASH(-0.1);

    private final double q;

    public double getQ() {
        return q;
    }

    Quality(double q) {
        this.q = q;
    }
}
