//Write a program to accept a string from the user and find out the
// following statistics:
// (a)Count of uppercase character
// (b)Count of lowercase character
// (c)Count of digits
// (d)Count of spaces

import java.util.*;  

public class StringStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int upperCount = 0, lowerCount = 0, digitCount = 0, spaceCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isLowerCase(ch))
                lowerCount++;
            else if (Character.isDigit(ch))
                digitCount++;
            else if (Character.isWhitespace(ch))
                spaceCount++;
        }

        System.out.println("\nString Statistics:");
        System.out.println("(a) Count of uppercase characters: " + upperCount);
        System.out.println("(b) Count of lowercase characters: " + lowerCount);
        System.out.println("(c) Count of digits: " + digitCount);
        System.out.println("(d) Count of spaces: " + spaceCount);
    }
}
