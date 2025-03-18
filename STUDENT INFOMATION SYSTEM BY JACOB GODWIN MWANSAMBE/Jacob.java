import java.util.ArrayList; // Import the ArrayList class for using dynamic arrays
import java.util.Collections; // Import the Collections class for sorting lists
import java.util.Scanner; // Import the Scanner class to read user input

public class Jacob { // Define the public class named 'Jacob'
    public static void main(String[] args) { // Main method: the entry point of the program
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList to store car names

        System.out.println("Enter the number of car names you want to add:"); // Prompt the user to specify the number of cars to input
        int n = scanner.nextInt(); // Read the number of cars as an integer
        scanner.nextLine(); // Consume the newline character left after reading the integer

        System.out.println("Enter " + n + " car names:"); // Prompt the user to input car names
        for (int i = 0; i < n; i++) { // Loop n times, where n is the number of cars to input
            System.out.print("Car " + (i + 1) + ": "); // Prompt the user to enter the name of the car
            String car = scanner.nextLine(); // Read the car name entered by the user
            cars.add(car); // Add the car name to the ArrayList
        }

        Collections.sort(cars); // Sort the ArrayList of car names in alphabetical order

        System.out.println("\nSorted list of cars:"); // Print a message before displaying the sorted list
        for (String car : cars) { // Enhanced for loop: iterate through each car name in the sorted list
            System.out.println(car); // Print each car name
        }

        scanner.close(); // Close the Scanner object to release system resources
    } 
}
