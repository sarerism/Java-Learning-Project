package secondCode;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        // Continue Statement

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Enter a positive number.");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {  
                    continue; 
                }
                System.out.println(i);
            }
        }

        input.close();
    }
}
