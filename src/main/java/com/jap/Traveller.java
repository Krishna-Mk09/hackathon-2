package com.jap;

import java.util.Arrays;

public class Traveller {
    public static void main(String[] args) {

        // Creating an array of strings.
        String[] Cities = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        // Creating an array of integers.
        int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        // Creating an object of the class Traveller.
        Traveller traveller = new Traveller();
        // Calling the method toUpperCase and passing the array of cities as an argument.
        String Result = traveller.toUpperCase(Arrays.toString(Cities));
        // Printing the result of the method call.
        System.out.println("UpperCase cities = " + Result);


        // This is a method call.
        String[] cities = Traveller.toSortCityArray(Cities);

        // This is a method call.
        int[] sortedDistance = Traveller.toSortDistanceArray(distance);

        // This is a method call.
        String city = Traveller.toFindNearestCity(distance, cities);
        System.out.println("Nearest city 52 km is equal to = " + city);


        // This is a method call.
        String CityDistance = Traveller.toFindFarestCity(distance, cities);
        System.out.println("Nearest City 270 km is equal to = " + CityDistance);


    }


    /**
     * The function takes an array of cities as input, sorts the array, and returns the sorted array
     *
     * @param Cities An array of strings that represent the cities to sort.
     * @return The method is returning the sorted array of cities.
     */
    public static String[] toSortCityArray(String[] Cities) {
        Arrays.sort(Cities);
        System.out.println("Sorted cities" + Arrays.toString(Cities));
        return Cities;
    }

    /**
     * The function takes an array of integers as an argument, sorts the array, and returns the sorted array
     *
     * @param distance an array of integers
     * @return The sorted array is being returned.
     */
    public static int[] toSortDistanceArray(int[] distance) {
        Arrays.sort(distance);
        System.out.println("sorted array is = " + Arrays.toString(distance));
        return distance;
    }

    // This method is finding the city name which is the nearest from the given distance.
    public static String toFindNearestCity(int[] distance, String[] cities) {
        String cityName = " ";
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] == 52) {
                cityName = cities[i];
            }
        }
        return cityName;

    }

    // This method is finding the city name which is the farest from the given distance.
    public static String toFindFarestCity(int[] distance, String[] cities) {
        String cityName = " ";
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] >= 270) {
                cityName = cities[i];
            }
        }
        return cityName;

    }

    /**
     * Given a string, return the string in all uppercase.
     *
     * @param cities a String
     * @return The cities string is being returned in all uppercase letters.
     */
    public String toUpperCase(String cities) {
        return cities.toUpperCase();
    }
}
