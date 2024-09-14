package secondCode;

import java.util.Arrays;

public class ArrayTwo {
    public static void main(String[] args){

        // Array

        int[] numberOfCars = {3465,3768,4067,3976,4782,2057,2954};

        int GrößteZahl = 0;
        
        for (int i=0;i<numberOfCars.length;i++){
            if (numberOfCars[i] > GrößteZahl){
                GrößteZahl = numberOfCars[i];
            }
        }
        System.out.println(GrößteZahl);

        System.out.println(numberOfCars[0]);
        Arrays.sort(numberOfCars);
        System.out.println(numberOfCars[0]);
    }   
    
}
