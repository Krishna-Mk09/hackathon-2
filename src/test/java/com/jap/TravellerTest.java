package com.jap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TravellerTest {
    Traveller traveller;
    String[] cityNames;
    int[] distance;

    @BeforeEach
    public void setUp() {
        traveller = new Traveller();
        cityNames = new String[]{"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        distance = new int[]{138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
    }

    @AfterEach
    public void tearDown() {
    }

    @Test    //write all the test cases here
    public void checkSortedCitiesInAlphabeticalOrderSuccess() {
        String[] expected = {"Basel", "Bern", "Engelberg", "Geneva", "Grindelwald", "Interlaken", "Jungfraujoch", "Lucerne", "Murren", "Zermatt"};
        Assertions.assertEquals(expected[0], Traveller.toSortCityArray(cityNames)[0]);
        Assertions.assertEquals(expected[1], Traveller.toSortCityArray(cityNames)[1]);
        Assertions.assertEquals(expected[2], Traveller.toSortCityArray(cityNames)[2]);
    }

    @Test    //write all the test cases here
    public void checkSortedCitiesInAlphabeticalOrderFailure() {
        String[] expected = {"Basel", "Bern", "Engelberg", "Geneva", "Grindelwald", "Interlaken", "Jungfraujoch", "Lucerne", "Murren", "Zermatt"};
        Assertions.assertNotEquals(expected[0], Traveller.toSortCityArray(cityNames)[3]);
        Assertions.assertNotEquals(expected[0], Traveller.toSortCityArray(cityNames)[2]);
        Assertions.assertNotEquals(expected[0], Traveller.toSortCityArray(cityNames)[5]);
    }

    @Test
    public void checkSortedDistanceInAscendingOrderSuccess() {
        int[] expected = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        Assertions.assertEquals(expected[0], traveller.toSortDistanceArray(distance)[0]);
        Assertions.assertEquals(expected[1], traveller.toSortDistanceArray(distance)[1]);
        Assertions.assertEquals(expected[2], traveller.toSortDistanceArray(distance)[2]);
    }

    @Test
    public void checkSortedDistanceInAscendingOrderFailure() {
        int[] expected = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        Assertions.assertNotEquals(expected[0], traveller.toSortDistanceArray(distance)[6]);
        Assertions.assertNotEquals(expected[0], traveller.toSortDistanceArray(distance)[1]);
        Assertions.assertNotEquals(expected[0], traveller.toSortDistanceArray(distance)[2]);
    }

    @Test
    public void cityNamesConvertedToUpperCaseSuccess() {
        String name = "bern";
        String expected = "BERN";
        String actual = traveller.toUpperCase(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void cityNamesConvertedToUpperCaseFailure() {
        String name = "bern";
        String expected = "berN";
        String actual = traveller.toUpperCase(name);
        Assertions.assertNotEquals(expected, actual);
    }

    @Test
    public void cityWhichIs52kmsFromZurichSuccess() {
        Assertions.assertEquals("Lucerne", traveller.toFindNearestCity(distance, cityNames));
    }

    @Test
    public void cityWhichIs52kmsFromZurichFailure() {
        Assertions.assertNotEquals("Basel", traveller.toFindNearestCity(distance, cityNames));
        Assertions.assertNotEquals("Geneva", traveller.toFindNearestCity(distance, cityNames));
    }

    @Test
    public void cityWhichIsGreaterThan270kmsFromZurichSuccess() {
        Assertions.assertEquals("Geneva", traveller.toFindFartestCity(distance, cityNames));
    }

    @Test
    public void cityWhichIsGreaterThan270kmsFromZurichFailure() {
        Assertions.assertNotEquals("Basel", traveller.toFindFartestCity(distance, cityNames));
        Assertions.assertNotEquals("Lucerne", traveller.toFindFartestCity(distance, cityNames));
    }
}