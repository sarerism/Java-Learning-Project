package secondCode;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = input.nextInt();

    for (int i=1; i<number+1;i++){
        System.out.println(i);
    }

    input.close();
    
    }
    
}
