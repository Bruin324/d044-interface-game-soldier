package com.company;

public interface Explode extends Special {
    public Bomb explode();

    class Bomb {
        @Override
        public String toString() {
            return "Go Boom!";
        }
    }
}
