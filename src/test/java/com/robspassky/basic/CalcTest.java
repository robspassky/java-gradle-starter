package com.robspassky.basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test public void canAdd() {
        Calc a = new Calc(5);
        assertEquals(10, a.add(5), "add doesn't work");
    }

}
