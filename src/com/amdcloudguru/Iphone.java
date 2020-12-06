package com.amdcloudguru;

public class Iphone {

    private IphoneModel model; // defining properties, where "private" is called Data Encapsulation which helps us hide data from the world
    private double price; // defining properties
    private boolean isWaterResistant;
    // All three above are properties

    public Iphone(){}

    public Iphone(IphoneModel model, double price, boolean isWaterResistant) {
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    // Behaviors are the functionality of a Class


    public IphoneModel getModel() {
        return model;
    }

    public void setModel(IphoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price; // this is referring to current instance of class
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.isWaterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
