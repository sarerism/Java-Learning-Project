package secondCode;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        // Switch

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of Month: ");
    int Month = input.nextInt();

    switch(Month) {

        case 1 :
            System.out.println("Jauary");
            break;
        case 2 :
            System.out.println("Febuary");
            break;
        case 3 :
            System.out.println("March");
            break;
        case 4 :
            System.out.println("April");
            break;
        case 5 :
            System.out.println("May");
            break;
        case 6 :
            System.out.println("June");
            break;
        case 7 :
            System.out.println("July");
            break;
        case 8 :
            System.out.println("August");
            break;
        case 9 :
            System.out.println("September");
            break;
        case 10 :
            System.out.println("October");
            break;
        case 11 :
            System.out.println("November");
            break;
        case 12 :
            System.out.println("December");
            break;
        default :
            System.out.println("Enter only number between 1-12");
    }
    input.close();

    }
    
}
