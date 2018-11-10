package com.notionquest.fibonacci;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class FibonacciSequenceTest {

    private FibonacciSequence fibonacciSequence;
    @Before
    public void setUp() throws Exception {
        fibonacciSequence = new FibonacciSequence();
    }

    @Test
    public void test_0() throws InterruptedException {
        assertEquals(BigInteger.ZERO, fibonacciSequence.getFibonacciSequence(0));
    }

    @Test
    public void test_1() throws InterruptedException {
        assertEquals(BigInteger.ONE, fibonacciSequence.getFibonacciSequence(1));
    }

    @Test
    public void test_2() throws InterruptedException {
        assertEquals(BigInteger.ONE, fibonacciSequence.getFibonacciSequence(2));
    }

    @Test
    public void test_3() throws InterruptedException {
        assertEquals(BigInteger.valueOf(2), fibonacciSequence.getFibonacciSequence(3));
    }

    @Test
    public void test_4() throws InterruptedException {
        assertEquals(BigInteger.valueOf(3), fibonacciSequence.getFibonacciSequence(4));
    }

    @Test
    public void test_5() throws InterruptedException {
        assertEquals(BigInteger.valueOf(5), fibonacciSequence.getFibonacciSequence(5));
    }

    @Test
    public void test_6() throws InterruptedException {
        assertEquals(BigInteger.valueOf(8), fibonacciSequence.getFibonacciSequence(6));
    }

    @Test
    public void test_7() throws InterruptedException {
        assertEquals(BigInteger.valueOf(13), fibonacciSequence.getFibonacciSequence(7));
    }

    @Test
    public void test_8() throws InterruptedException {
        assertEquals(BigInteger.valueOf(21), fibonacciSequence.getFibonacciSequence(8));
    }

    @Test
    public void test_39() throws InterruptedException {
        assertEquals(BigInteger.valueOf(63245986), fibonacciSequence.getFibonacciSequence(39));
    }

    @Test
    public void test_100() throws InterruptedException {
        assertEquals(BigInteger.valueOf(63245986), fibonacciSequence.getFibonacciSequence(39));
    }
}