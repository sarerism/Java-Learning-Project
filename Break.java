package secondCode;

import java.util.Scanner;

public class Break {
    public static void main(String[] args){
    
    // Break statments

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Number (1-100): ");
    int number = input.nextInt();

    for (int i=1; i<=number;i++){
        if (number>0 && number<100){
            System.out.println(i);
        }
        else{
            break;
        }
    }

    input.close();

    }
    
}
