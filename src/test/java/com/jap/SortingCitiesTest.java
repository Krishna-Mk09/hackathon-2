package com.jap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortingCitiesTest {
    SortingCitiesTest input;
    String[] cities;

    @BeforeEach
    public void setUp() {
        input = new SortingCitiesTest();
    }

    @AfterEach
    public void tearDown() {
    }

    //write all the test cases here

    @Test
    public void convertToUpperCase() {
        String input = "bern";
        String expected = "BERN";
        String actualResult = input.toUpperCase();
        Assertions.assertEquals(expected, actualResult);

    }

    @Test
    public void sortingKilometersOfCites() {
        int[] kilometer = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        int[] expectedResult = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        int[] actualResult = input.toSortDistance(kilometer);
        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Test
    void sortingCityNames() {
        String[] names = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch" };
        String[] expected = {"Basel", "Bern", "Engelberg", "Geneva", "Grindelwald", "Interlaken", "Jungfraujoch", "Lucerne", "Murren", "Zermatt" };
        String[] actualResult = input.SortingCityNames(names);
        Assertions.assertEquals(expected, actualResult);
    }


    @Test
    void testConvertToUpperCase() {
    }

    @Test
    void findCityThatIs52FromZurich() {
    }

    @Test
    void greaterThanOEquaTo270KmsFromZurich() {
    }
}