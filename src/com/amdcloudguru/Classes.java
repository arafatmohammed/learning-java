package com.amdcloudguru;

public class Classes {
    public static void main(String[] args) {
        Iphone iphone7Plus = new Iphone(IphoneModel.IPHONE_7_PLUS, 200.00, false);
//        Iphone iphoneXMax = new Iphone();

        System.out.println(iphone7Plus.getModel());
        System.out.println(iphone7Plus.getModel().getModelStr());
//
//        iphone7Plus.setModel("7+");
//        iphone7Plus.setPrice(100.00);
//        iphone7Plus.setWaterResistant(false);

//        iphoneXMax.setModel("Xmax");
//        iphoneXMax.setPrice(500.00);
//        iphoneXMax.setWaterResistant(true);

//        System.out.println(iphone7Plus.getModelStr());
//        System.out.println(iphone7Plus.getPrice());
//        System.out.println(iphone7Plus.isWaterResistant());

//        System.out.println(iphoneXMax.getModelStr());
//        System.out.println(iphoneXMax.getPrice());
//        System.out.println(iphoneXMax.isWaterResistant());

//        System.out.println(iphone7Plus);

        // Encapsulation: Data in your class should be hidden from outside world and only be used by its own methods

    }
}
