// Write a Java class called CountAndPrintArgs to print the number of
// arguments passed on the command-line as well as the 1st letter of the
// arguments. For example, if the command line arguments are: “Mango
// Cucumber Apple” then the output will be
// No. of arguments – 3 MCA
// Write a main method to test the class. 

import java.util.*;  // Import statement (optional, but good practice)

public class CountAndPrintArgs {
    public static void main(String[] args) {
        // Count the number of arguments
        int count = args.length;

        // Print the number of arguments
        System.out.print("No. of arguments - " + count + " ");

        // Print the first letter of each argument
        for (String arg : args) {
            if (!arg.isEmpty()) {
                System.out.print(arg.charAt(0));
            }
        }

        // Move to the next line after printing
        System.out.println();
    }
}
