package secondCode;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {

        // Comparison operators

        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int x = input.nextInt();

        System.out.print("First number: ");
        int y = input.nextInt();

        if (x==y){
            System.out.println("Both number are equal");
        }
        else if(x!=y){
            System.out.println("Numbers are not equal");
            if (x>y){
                System.out.println("First number is greater");
            }
            else if (x<y) {
                System.out.println("Second number is greater");
            }
            
        }

        input.close();

    }
    
}
