package com.jap;

import java.util.Arrays;

public class Traveller {
    public static void main(String[] args) {

        // Creating an array of strings.
        String[] Cities = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        // Creating an array of integers.
        int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        Traveller traveller = new Traveller();
        String Result = traveller.toUpperCase(Arrays.toString(Cities));
        System.out.println("UpperCase cities = " + Result);


        String[] cities = Traveller.toSortCityArray(Cities);

        int[] sortedDistance = Traveller.toSortDistanceArray(distance);
    }


    public static String[] toSortCityArray(String[] Cities) {
        Arrays.sort(Cities);
        System.out.println("Sorted cities" + Arrays.toString(Cities));
        return Cities;
    }

    public String toUpperCase(String cities) {
        return cities.toUpperCase();
    }

    public static int[] toSortDistanceArray(int[] distance) {
        Arrays.sort(distance);
        System.out.println("sorted array is = " + Arrays.toString(distance));
        return distance;
    }

    public String toFindNearestCity() {

        return null;
    }

    public String toFindFarestCity() {

        return null;
    }
}
