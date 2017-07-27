package com.company;

public class Archer extends Soldier implements Special {

    public Archer(String name, String rank, int serialNumber, boolean isDecorated) {
        super(name, rank, serialNumber, isDecorated);
    }

    @Override
    public String speak() {
        return "Nock Arrows!!";
    }

    @Override
    public String special() {
        return "Let 'em fly!!";
    }

    @Override
    public String toString() {
        return "Archer{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", serialNumber=" + serialNumber +
                ", isDecorated=" + isDecorated +
                '}';
    }
}


