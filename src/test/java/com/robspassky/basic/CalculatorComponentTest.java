package com.robspassky.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@SpringJUnitConfig
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorComponentTest {

    @Test
    public void testAdd() {
        CalculatorComponent classUnderTest = new CalculatorComponent();
        classUnderTest.setZ(5);
        assertEquals(10, classUnderTest.add(5));
        assertEquals(-15, classUnderTest.add(-20));
    }
    @Test
    public void testMul() {
        CalculatorComponent classUnderTest = new CalculatorComponent();
        classUnderTest.setZ(5);
        assertEquals(10, classUnderTest.mul(2));
        assertEquals(-15, classUnderTest.mul(-3));
    }

}
