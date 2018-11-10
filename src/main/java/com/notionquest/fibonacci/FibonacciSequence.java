package com.notionquest.fibonacci;

import java.math.BigInteger;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class FibonacciSequence {
    public BigInteger getFibonacciSequence(int n) throws InterruptedException {
        BigInteger num = BigInteger.valueOf(n);
        BigInteger num2 = BigInteger.valueOf(2);
        BlockingDeque<BigInteger> deque = new LinkedBlockingDeque<>(2);
        deque.put(BigInteger.ONE);
        deque.put(BigInteger.ONE);
        switch (n) {
            case 0:
                return BigInteger.ZERO;
            case 1:
            case 2:
                return BigInteger.ONE;
            default:
                for (BigInteger b = num2; b.compareTo(num) < 0; b = b.add(BigInteger.ONE)) {
                    deque.putLast(deque.takeFirst().add(deque.peekLast()));
                    System.out.println(b);
                }
                return deque.peekLast();
        }
    }
}
