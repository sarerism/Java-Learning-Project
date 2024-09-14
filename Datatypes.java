package secondCode;

public class Datatypes {
    public static void main(String[] args){

        // primitive data-types

        byte age = 23; // 1 byte [-128->127]
        short salary = 1500; // 2 bytes
        int money = 29990000; //4 bytes
        long phoneNumber = 49174812761712L; // 8 bytes

        float height = 6.25f; // 4 bytes
        double pi = 3.1415926535897932; // 8 bytes

        boolean isMale = true; // 1 byte
        char favChar = 's'; // 2 bytes
        if (isMale)
            System.out.println("Hello there!\nI am " + age + " years old.\nI earn " + salary + " per month.\nIn my bank I have " + money+ "Euros.\nMy phone numner is: " + phoneNumber + "\nBTW I am " + height + "cm tall.\nMy favourite number is " + pi + "\nAnd my favourite character is \"" + favChar + "\"");
    }
    
}
