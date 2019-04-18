package com.robspassky.basic;

import org.springframework.stereotype.Component;

@Component
public class IncrementComponent {
    private int count = 0;

    public void incr() { this.count += 1; }

    public int getCount() { return this.count; }

    public IncrementComponent() {}
}
