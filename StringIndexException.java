Write a Java program that takes an input string and an index value from the user, and handles the StringIndexOutOfBoundsException that may occur when attempting to access a character in the string that is out of bounds.

Input Format

The program should take a string and an integer index value as input from the user.

Constraints

The input string should not be empty and should contain only alphabetical characters
The input index value should be within the range of 0 to length of string - 1.

Output Format

The program should output the character at the specified index value if it is valid, or an error message "Error" if an exception occurs .

Sample Input 0

Hello World
3
Sample Output 0

l



solution:-


import java.util.Scanner;

public class StringIndexException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        String str = scanner.nextLine();

        System.out.print("");
        int index = scanner.nextInt();

        if (str.isEmpty() || !str.matches("[a-zA-Z ]+")) {
            System.out.println("Error");
        } else {
            try {
                char ch = str.charAt(index);
                System.out.println(ch);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Error");
            }
        }

        scanner.close();
    }
}

























