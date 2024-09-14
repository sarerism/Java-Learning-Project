package secondCode;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){

    // Inputs

    Scanner input = new Scanner(System.in); // Made the scanner

    System.out.print("username: ");
    String username = input.next();

    System.out.print("Password: ");
    String password = input.next();

    if (username.equals("sarerism") && (password.equals("fbluer"))){
        System.out.println("Welcome " + username);
    }
    else {
        System.out.println("Incorrect Username or Password.");
    }

input.close();

    }
    
}
