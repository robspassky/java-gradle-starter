package com.robspassky.basic;

public class Calc {
    private int z;

    Calc() {
        this.z = 10;
    }

    Calc(int z) {
        this.z = z;
    }
    public int add(int x) {
        return z + x;
    }
}
