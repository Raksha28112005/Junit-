package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComparatorTest {
    Comparator comp = new Comparator();
    @Test void testHighest() {
        assertEquals(30, comp.findHighest(30, 10, 20)); // A is highest
        assertEquals(30, comp.findHighest(10, 30, 20)); // B is highest
        assertEquals(30, comp.findHighest(10, 20, 30)); // C is highest
        assertEquals(10, comp.findHighest(10, 10, 10)); // All equal
    }
}