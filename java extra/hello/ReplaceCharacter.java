//Write a Java program to replace all the ‘d’ characters with ‘f’
//characters from the given string
import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Replace all 'd' with 'f'
        String replacedStr = str.replace('d', 'f');

        // Display result
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + replacedStr);

        sc.close();
    }
}
