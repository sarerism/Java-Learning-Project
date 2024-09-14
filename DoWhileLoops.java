package secondCode;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args){

    //  Do While Loops

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number: ");
    int number = input.nextInt();

    int i = 1;
    do {
        System.out.println(i);
        i++;
    }
    while(i<=number);

    input.close();
    }
    
}
