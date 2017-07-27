package com.company;

public class Infantry extends Soldier implements Hit, Kick, Special {

    public Infantry(String name, String rank, int serialNumber, boolean isDecorated) {
        super(name, rank, serialNumber, isDecorated);
    }

    @Override
    public String hit() {
        return "Right in the kisser!";
    }

    @Override
    public String kick() {
        return "Feet of Fury!";
    }

    @Override
    public String speak() {
        return "Forward! March!";
    }

    @Override
    public String special() {
        return "Berserker Rage!";
    }

    @Override
    public String slash() {
        return "I'll run you through";
    }

    @Override
    public String toString() {
        return "Infantry{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", serialNumber=" + serialNumber +
                ", isDecorated=" + isDecorated +
                '}';
    }
}
