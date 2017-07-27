package com.company;

public class Cavalry extends Soldier implements Hit, Kick, Special {

    public Cavalry(String name, String rank, int serialNumber, boolean isDecorated) {
        super(name, rank, serialNumber, isDecorated);
    }

    @Override
    public String hit() {
        return "Uppercut!";
    }

    @Override
    public String kick() {
        return "Taste my boot!";
    }

    @Override
    public String speak() {
        return "Tally Ho!";
    }

    @Override
    public String special() {
        return "Triple Trample!!";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cavalry{");
        sb.append("name='").append(name).append('\'');
        sb.append(", rank='").append(rank).append('\'');
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", isDecorated=").append(isDecorated);
        sb.append('}');
        return sb.toString();
    }
}
