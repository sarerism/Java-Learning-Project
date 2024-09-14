package secondCode;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){

    // While loops

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    int i = 1;

    while (i<number+1) {
        System.out.println(i);
        i++;
    }

    input.close();

    }
    
}