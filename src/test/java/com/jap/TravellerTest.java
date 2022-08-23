package com.jap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TravellerTest {
    Traveller input;

    @BeforeEach
    void setUp() {
        input = new Traveller();

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testMain() {
    }

    @Test
    void testSortCityArray() {
        String[] names = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        String[] expected = {"Basel", "Bern", "Engelberg", "Geneva", "Grindelwald", "Interlaken", "Jungfraujoch", "Lucerne", "Murren", "Zermatt"};
        String[] actualresult = Traveller.toSortCityArray(names);
        Assertions.assertEquals(expected, actualresult);
    }

    @Test
    void testSortDistanceArray() {
        int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        int[] expected = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        int[] actual = input.toSortDistanceArray(distance);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testToFindNearestCity() {
        int number = 52;

        String expected = "Lucerne";
        String actualresult = input.toFindNearestCity(number);
        Assertions.assertEquals(expected, actualresult);

    }

    @Test
    void testToFindFartestCity() {
        int number = 276;
        String expected = "Geneva";
        String actual = input.toFindNearestCity(number);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testToUpperCase() {
        String name = "bern";
        String expected = "BERN";
        String actual = input.toUpperCase(name);
        Assertions.assertEquals(expected, actual);
    }
}