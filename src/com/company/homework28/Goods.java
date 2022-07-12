package com.company.homework28;

public enum Goods {
    MEAT(50, 100),
    SEED(30, 50),
    WHEAT(20, 70),
    PAINT(60, 60),
    CLOTH(70, 30),
    DRIED_FRUITS(80,90);


    private final int weightOfGoods;
    private double price;

    private Quality quality;

    Goods(int weight, double price){
        this.weightOfGoods = weight;
        this.price = price;
        quality = Quality.A1;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public int getWeightOfGood(){
        return weightOfGoods;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
