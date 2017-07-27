package com.company;

public interface Special {
    public String special ();

    public default String slash() {
        return "Taste my steel";
    };
}
