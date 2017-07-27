package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Infantry expendable = new Infantry("Joe", "private", 876, false);
        Cavalry royalty = new Cavalry("Sir Reginald", "Corporal", 123, true);
        Archer longShot = new Archer("Eagle-Eye", "Expert Marksman", 000, true);

        System.out.println(expendable);
        System.out.println(royalty);
        System.out.println(longShot);

        System.out.println(expendable.hit());
        System.out.println(royalty.special());
        System.out.println(longShot.speak());

        Grenadier pyro = new Grenadier ("Three-finger Tommy", "noob", 23, false);
        System.out.println(pyro.speak());
        System.out.println(pyro.explode());

        System.out.println(royalty.slash());
        System.out.println(expendable.slash());


    }
    static class Grenadier extends Soldier implements Explode{
        public Grenadier(String name, String rank, int serialNumber, boolean isDecorated) {
            super(name, rank, serialNumber, isDecorated);
        }

        @Override
        public Bomb explode() {
            Bomb bomb = new Bomb();
            return bomb;
        }

        @Override
        public String speak() {
            return "Bombs Away!";
        }

        @Override
        public String special() {
            return "Fire in the Hole!!";
        }
    }
}
