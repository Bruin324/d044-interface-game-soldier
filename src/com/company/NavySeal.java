package com.company;

public class NavySeal extends Soldier implements Knife, Gun{

    public NavySeal(String name, String rank, int serialNumber, boolean isDecorated) {
        super(name, rank, serialNumber, isDecorated);
    }

//    @Override
//    public String doDamage() {
//        return "Taking you down.";
//    }
//
//    @Override
//    public int doDamage() {
//        return 5;
//    }

    @Override
    public String speak() {
        return "Cover me";
    }
}
