package secondCode;

public class Strings {
    public static void main(String[] args){

        // non Primitive Datatypes

        String firstName = "Sareer";
        String lastName = "Cahn";
        String name2 = "SaReeR";
        String fullName = firstName + " " + lastName;
        String name3 = name2.replace('R','r');

        System.out.println(fullName.length());
        System.out.println(firstName.equals(name2));
        System.out.println(firstName.equalsIgnoreCase(name2));
        System.out.println(fullName);
        System.out.println(name2.charAt(2));
        System.out.println(name3);

    }
}