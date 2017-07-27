package com.company;

public abstract class Soldier {

    String name;
    String rank;
    int serialNumber;
    boolean isDecorated;

    public Soldier(String name, String rank, int serialNumber, boolean isDecorated) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
        this.isDecorated = isDecorated;
    }

    public String eat() {
        return "Three squares a day";
    }

    public String sleep() {
        return "Hit the racks";
    }

    public String PT() {
        return "Left Left LeftRightLeft";
    }

    public abstract String speak();
}
