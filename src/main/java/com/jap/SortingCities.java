package com.jap;

import java.util.Arrays;

public class SortingCities {
    public static void main(String[] args) {
        SortingCities input = new SortingCities();
        String[] Names = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch" };
        int[] KilometerArray = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        // Call the method to convert all the student names to upper case and display results
        for (String upperNames : Names) {
            System.out.print(input.convertToUpperCase(upperNames));
            System.out.print(" ");
        }

        // Sorting the array of names in ascending order.
        Arrays.sort(Names);
        System.out.println("\n" + Arrays.toString(Names));
        // Sorting the array of Kilometers of cities in ascending order.
        Arrays.sort(KilometerArray);
        System.out.println(Arrays.toString(KilometerArray));

        // Printing the index of the first element in the array that is greater than or equal to 270.
        System.out.println("sorted names = " + SortingCities.findCitynearestToZurich(KilometerArray));
        // Printing the index of the first element in the array that is greater than or equal to 270.
        System.out.println(("sorted city = " + SortingCities.greaterThanEquaTo270KmsFromZurich(KilometerArray)));
        // Returning the index of the first element in the array that is greater than or equal to 270.
        int nearDistance = KilometerArray[SortingCities.findCitynearestToZurich(KilometerArray)];
        // Returning the index of the first element in the array that is greater than or equal to 270.
        int farDistance = KilometerArray[SortingCities.greaterThanEquaTo270KmsFromZurich(KilometerArray)];
        // Returning the name of the city that is nearest to Zurich.
        String nearCityName = Names[SortingCities.findCitynearestToZurich(KilometerArray)];
        // Returning the index of the first element in the array that is greater than or equal to 270.
        String farCityName = Names[SortingCities.greaterThanEquaTo270KmsFromZurich(KilometerArray)];
        // Printing the name of the city that is nearest to Zurich and the distance in kilometers.
        System.out.println("nearDistance = " + nearCityName + " is " + nearDistance + " km ");
        // Printing the name of the city that is farthest from Zurich and the distance in kilometers.
        System.out.println("farDistance = " + farCityName + " is " + farDistance + " km ");

    }

    // Finding the index of the city that is nearest to Zurich.
    public static int findCitynearestToZurich(int[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == 52) ;
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * It returns the index of the first element in the array that is greater than or equal to 270
     *
     * @param name the array of integers
     * @return The index of the first element in the array that is greater than or equal to 270.
     */
    public static int greaterThanEquaTo270KmsFromZurich(int[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i] >= 270) ;
            return i;

        }
        return -1;

    }

    /**
     * This function sorts the array of Kilometers of cities in ascending order
     *
     * @param KilometerArray an array of integers
     * @return The method is returning the sorted array.
     */
    public int[] sortingKilometersOfCites(int[] KilometerArray) {
        Arrays.sort(KilometerArray);
        System.out.println("result " + Arrays.toString(KilometerArray));
        return KilometerArray;
    }

    /**
     * The function takes a string of city names, sorts them alphabetically, and returns the sorted string
     *
     * @param Names The names of the cities to be sorted.
     * @return The method is returning the sorted array of characters.
     */
    public String SortingCityNames(String Names) {
        Arrays.sort(Names.toCharArray());
        System.out.println("result " + Names);
        return Names;
    }

    /**
     * It takes a string and returns the same string in all uppercase
     *
     * @param Names The name of the parameter that will be passed in.
     * @return The string is being returned in upper case.
     */
    public String convertToUpperCase(String Names) {
        if (Names.equals("")) {
            return "";
        }
        return Names.toUpperCase();
    }

}
