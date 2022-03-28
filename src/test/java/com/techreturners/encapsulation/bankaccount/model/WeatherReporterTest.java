package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeatherReporterTest {
    WeatherReporter london;
    WeatherReporter california;
    WeatherReporter capeTown;
    WeatherReporter chichester;

    @BeforeEach
    void setup(){
        london = new WeatherReporter("London", 17);
        california = new WeatherReporter("California", 55);
        capeTown = new WeatherReporter("Cape Town", 7);
        chichester = new WeatherReporter("Chichester", 20);
    }

    @Test
    void checkGetLocation() {
        assertEquals("London", london.getLocation());
        assertEquals("California", california.getLocation());
        assertEquals("Cape Town", capeTown.getLocation());
        assertEquals("Chichester", chichester.getLocation());
    }

    @Test
    void checkGetCentigrade() {
        assertEquals(17, london.getCentigrade());
        assertEquals(55, california.getCentigrade());
        assertEquals(7, capeTown.getCentigrade());
        assertEquals(20, chichester.getCentigrade());
    }

    @Test
    void checkUpdateCentigrade() {
        chichester.updateCentigrade(21.5);
        assertEquals(21.5, chichester.getCentigrade());
    }

    @Test
    void checkPrint() {
        assertTrue(chichester.print().contains("68"));
        assertTrue(chichester.print().contains("😊"));
        assertTrue(chichester.print().contains("🔆"));
        assertTrue(chichester.print().contains(chichester.getLocation()));
        assertFalse(chichester.print().contains("🥵"));
    }
}