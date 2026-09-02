package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testMessage() {
        assertEquals(
            "Hello from Java + Jenkins!",
            App.getMessage()
        );
    }
}