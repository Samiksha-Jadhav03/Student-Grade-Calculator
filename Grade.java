import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();
        int[] marks = new int[numOfSubjects];
        
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        double average = (double) totalMarks / numOfSubjects;
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else if (average >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
