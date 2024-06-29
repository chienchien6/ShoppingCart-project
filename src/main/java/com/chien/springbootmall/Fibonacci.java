package com.chien.springbootmall;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
        fibonacciVersion01(10);
    }

    private static int fibonacciVersion01(int getFibonacciIndex) {

        List<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(1);
        fibonacci.add(1);

        for (int i = 2; i <= getFibonacciIndex; i++) {
            Integer NextNumber = fibonacci.get(i - 2) + fibonacci.get(i - 1);
            fibonacci.add(NextNumber);

            System.out.println(i);
            System.out.println(fibonacci);
        }
        return fibonacci.get(getFibonacciIndex);
    }


}
