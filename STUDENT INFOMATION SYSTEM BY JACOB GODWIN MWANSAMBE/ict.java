import java.util.Scanner; // Import the Scanner class for user input
import java.util.ArrayList; // Import the ArrayList class for managing a dynamic list of students

public class ict { // Define the main class
    public static void main(String[] args) { // The main method, the entry point of the program
        Scanner ob = new Scanner(System.in); // Create a Scanner object to read user input
        ArrayList<String> students = new ArrayList<String>(); // Create an ArrayList to store student names dynamically
        int choice; // Variable to store the user's menu choice

        do { // Start of a loop that continues until the user chooses to exit
            // Display the menu options
            System.out.println("\nMenu:");
            System.out.println("1. Create a list of students"); // Option to create a list of students
            System.out.println("2. Read the list of students"); // Option to display the students
            System.out.println("3. Update a student's information"); // Option to update a student's information
            System.out.println("4. Delete a student from the list"); // Option to delete a student from the list
            System.out.println("5. Exit"); // Option to exit the program
            System.out.print("Enter your choice (1, 2, 3, 4, or 5): "); // Prompt the user to enter their choice
            choice = ob.nextInt(); // Read the user's choice
            ob.nextLine(); // Consume the newline character to prepare for the next input

            switch (choice) { // Switch-case block to handle the user's choice
                case 1:
                    // Handle the creation of a list of students
                    System.out.print("Enter the number of students you want to create: "); // Ask the user for the number of students
                    int n = ob.nextInt(); // Read the number of students
                    ob.nextLine(); // Consume the newline character

                    // Add students to the ArrayList
                    for (int i = 0; i < n; i++) { // Loop to get the names of all students
                        System.out.print("Student " + (i + 1) + ": "); // Prompt the user to enter each student's name
                        String student = ob.nextLine(); // Read the student's name
                        students.add(student); // Add the student's name to the ArrayList
                    }
                    System.out.println("Student list has been created!"); // Notify the user that the list has been created
                    break;

                case 2:
                    // Handle displaying the list of students
                    if (students.isEmpty()) { // Check if the student list is empty
                        System.out.println("No students have been added yet. Please create a list first."); // Notify if the list is empty
                    } else {
                        System.out.println("The students in the list are:"); // Display a header
                        for (int i = 0; i < students.size(); i++) { // Loop through the student list
                            System.out.println((i + 1) + ". " + students.get(i)); // Print each student with their index
                        }
                    }
                    break;

                case 3:
                    // Handle updating a student's information
                    if (students.isEmpty()) { // Check if the student list is empty
                        System.out.println("No students have been added yet. Please create a list first."); // Notify if the list is empty
                    } else {
                        System.out.println("Enter the number of the student you want to update:"); // Prompt for the student to update
                        for (int i = 0; i < students.size(); i++) { // Display all students
                            System.out.println((i + 1) + ". " + students.get(i)); // Show the student number and name
                        }
                        int updateIndex = ob.nextInt() - 1; // Read the user's choice and adjust for 0-based index
                        ob.nextLine(); // Consume the newline character
                        if (updateIndex >= 0 && updateIndex < students.size()) { // Check if the input index is valid
                            System.out.print("Enter the new name for student " + (updateIndex + 1) + ": "); // Prompt for the new name
                            String newName = ob.nextLine(); // Read the new name
                            students.set(updateIndex, newName); // Update the name in the ArrayList
                            System.out.println("Student information has been updated!"); // Notify the user
                        } else {
                            System.out.println("Invalid student number!"); // Notify if the input is invalid
                        }
                    }
                    break;

                case 4:
                    // Handle deleting a student from the list
                    if (students.isEmpty()) { // Check if the student list is empty
                        System.out.println("No students have been added yet. Please create a list first."); // Notify if the list is empty
                    } else {
                        System.out.println("Enter the number of the student you want to delete:"); // Prompt for the student to delete
                        for (int i = 0; i < students.size(); i++) { // Display all students
                            System.out.println((i + 1) + ". " + students.get(i)); // Show the student number and name
                        }
                        int deleteIndex = ob.nextInt() - 1; // Read the user's choice and adjust for 0-based index
                        ob.nextLine(); // Consume the newline character
                        if (deleteIndex >= 0 && deleteIndex < students.size()) { // Check if the input index is valid
                            students.remove(deleteIndex); // Remove the student from the ArrayList
                            System.out.println("Student has been deleted!"); // Notify the user
                        } else {
                            System.out.println("Invalid student number!"); // Notify if the input is invalid
                        }
                    }
                    break;

                case 5:
                    // Handle exiting the program
                    System.out.println("You are exiting the program. Goodbye!"); // Goodbye message
                    break;

                default:
                    // Handle invalid menu choices
                    System.out.println("Invalid choice! Please choose a valid option (1 to 5)."); // Error message for invalid input
            }
        } while (choice != 5); // Loop until the user chooses to exit

        ob.close(); // Close the Scanner to free up resources
    }
}
