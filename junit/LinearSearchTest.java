package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LinearSearchTest {
    LinearSearch ls = new LinearSearch();
    @Test void testSearch() {
        int[] data = {10, 20, 30};
        assertEquals(1, ls.search(data, 20));
        assertEquals(-1, ls.search(data, 50));
        assertEquals(-1, ls.search(null, 10));
    }
}