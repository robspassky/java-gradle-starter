/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.robspassky.basic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppTest {

    @Mock Calc c;

    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test public void testAppAdd() {
        App classUnderTest = new App();

        // when the mock is called add(8), return 100
        when(c.add(8)).thenReturn(100);
        assertEquals(100, classUnderTest.doAdd(8, c), "should ");

        // verify that the add() method of the mock was called with an arg of 8
        verify(c).add(8);
    }
}
