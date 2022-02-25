package com.lawlett.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    Math math;

    @Before
    public void setup(){
        math = new Math();
        System.out.println("before");
    }
    @Test
    public void SimplePlusCase(){
        assertEquals("4",math.plus("2","2"));
    }

    @After
    public void tearDown(){
        math = null;
        System.out.println("after");
    }
}
