package com.amdcloudguru;

public enum IphoneModel {
    IPHONE_7_PLUS("Iphone 7+"),
    IPHONE_7("Iphone 7"),
    IPHONE_X("Iphone X");

    private String modelStr;

    IphoneModel(String modelStr) {
        this.modelStr = modelStr;
    }

    public String getModelStr() {
        return modelStr;
    }
}
