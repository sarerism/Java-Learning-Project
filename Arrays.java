package secondCode;

public class Arrays {
    public static void main(String[] args) {

        // arrays 

        int[] Marks = new int[5];
        Marks[0] = 50;
        Marks[1] = 30;
        Marks[2] = 40;
        Marks[3] = 60;
        Marks[4] = 10;

        int totalMarks = 0;
        int obtainMarks = 0;

        for (int i = 0; i < Marks.length; i++) {
            totalMarks = totalMarks+100;
            obtainMarks = obtainMarks+Marks[i];
        }
        int avgMarks = obtainMarks/Marks.length;
        float percentage = (float)(obtainMarks/(float)totalMarks)*100;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainMarks);
        System.out.println("Average Marks: " + avgMarks);
        System.out.println("Your percentage: " + percentage + "%");
    }
}
