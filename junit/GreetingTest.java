package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GreetingTest {
    Greeting g = new Greeting();
    @Test void testGreetings() {
        assertEquals("Hello, Raksha!", g.getMessage("Raksha"));
        assertEquals("Hello, Guest!", g.getMessage(null));
        assertEquals("Hello, Guest!", g.getMessage(" "));
    }
}