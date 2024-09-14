package secondCode;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions {
    @SuppressWarnings("resource")
    public static void main(String[] args){

        // Try -- Catch (Exceptions)

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        long number = 0;

        try {
            number = input.nextLong(); // Use nextLong() to handle larger numbers
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            input.close();
            return; // Exit the program if input is invalid
        }

        try {
            // Perform multiplication and handle overflow
            long mult = number * number;
            
            // Check if the result seems incorrect due to overflow
            if (mult / number != number) {
                throw new ArithmeticException("Overflow occurred during multiplication.");
            }

            System.out.println("Square of the number is " + mult);
        } catch (ArithmeticException e) {
            System.out.println("The number you entered is too big!");
        }

        input.close();
    }
}
