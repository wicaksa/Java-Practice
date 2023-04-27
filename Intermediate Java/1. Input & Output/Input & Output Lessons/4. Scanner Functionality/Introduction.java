import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        // Create a new instance of a scanner
        Scanner input = new Scanner(System.in);

        // Add code below:

        // 1. Beneath the comment, write the print statement that asks the user what
        // their name is.
        System.out.println("What is your name?");

        // 2. After the print statement, declare a new String variable called userName,
        // initialize it to the Scanner’s next String input, use the table from the
        // exercise to find the appropriate method.
        String userName = input.next();

        // 3. Use System.out.printf() to print the following statement:
        // Hello "userName"! It's nice to meet you.
        // where “userName” is replaced with the input provided by the user.
        System.out.printf("Hello %s! It's nice to meet you.", userName);

        // 4. Compile the program
        // Enter this into the command line: javac Introduction.java

        // 5. Run the program
        // Enger this into the command line: java Introduction
    }
}