package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Fibonacci.fibonacci;


public class FibonacciTest {
    @Test
    void NegatifFibonacciTerm(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> fibonacci(-5));
    }
    @Test
    void zeroFibonacciTerm(){
        Assertions.assertEquals(0,fibonacci(0));
    }
    @Test
    void PositifFibonacciTerm(){
        Assertions.assertEquals(1,fibonacci(2));
        Assertions.assertEquals(5,5);
    }
}