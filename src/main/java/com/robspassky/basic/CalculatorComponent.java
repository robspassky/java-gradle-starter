package com.robspassky.basic;

import org.springframework.stereotype.Component;

@Component
public class CalculatorComponent {
    private int z = 0;

    public int add(int x) {
        return z + x;
    }

    public int mul(int x) { return z * x; }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public CalculatorComponent() {}
}
