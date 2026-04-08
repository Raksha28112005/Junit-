package com.example;

public class Comparator {
    public int findHighest(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        return c;
    }
}