import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

//Mariah Dungey 02/09/2025
public class Main {
    static Scanner userIn = new Scanner(System.in);
    static ArrayList<String> cityNames = new ArrayList<>();
    static HashMap<String, ArrayList<Integer>> cityTemps = new HashMap<>();

    public static void main(String[] args) {
        userInput();
        userCityTemps();
        calcAvgTemps();
        displayCityTemps();
    }

    // Collects city names from user
    static void userInput() {
        System.out.println("Enter the city names, type 'end' to stop.");
        String userCities = userIn.nextLine();
        while (!userCities.equals("end")) {
            cityNames.add(userCities);
            userCities = userIn.nextLine();
        }
    }

    // Collects temperatures for each city
    static void userCityTemps() {
        for (String city : cityNames) {
            System.out.println("Enter temperatures for the next 5 days for the city of " + city + ".");
            ArrayList<Integer> temperatures = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.println("Day: " + i);
                Integer userTemps = userIn.nextInt();
                temperatures.add(userTemps);
            }
            cityTemps.put(city, temperatures);
            userIn.nextLine();
        }
    }

    // Calculates average
    static void calcAvgTemps() {
        for (String city : cityTemps.keySet()) {
            ArrayList<Integer> temps = cityTemps.get(city);
            int sum = 0;
            for (int temp : temps) {
                sum += temp;
            }

            double average = sum / 5.0;

            ArrayList<Integer> avgTemps = new ArrayList<>();
            avgTemps.add((int) average);

            cityTemps.put(city, avgTemps);
        }
    }

    // Displays
    static void displayCityTemps() {
        for (String city : cityTemps.keySet()) {
            ArrayList<Integer> temps = cityTemps.get(city);
            double average = temps.get(0); // Get the average from the list
            System.out.println("The average for " + city + " is " + average); // Display city and average
        }
    }
}
