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
public class IncrementComponentTest {

    @Test
    public void testIncrement() {
        IncrementComponent classUnderTest = new IncrementComponent();
        assertEquals(0, classUnderTest.getCount());
        classUnderTest.incr();
        assertEquals(1, classUnderTest.getCount());
        classUnderTest.incr();
        classUnderTest.incr();
        assertEquals(3, classUnderTest.getCount());
    }

}
