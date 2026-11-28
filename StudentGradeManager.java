
import java.util.Scanner;

public class StudentGradeManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] subjects = {
            "Java", "DSA", "Mathematics", "DBMS", "Computer Networks"
        };

        int[] marks = new int[5];
        int total = 0;

        System.out.println("===== STUDENT GRADE MANAGER =====");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Get marks for five subjects
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter marks in " + subjects[i] + ": ");
            marks[i] = sc.nextInt();

            total = total + marks[i];
        }

        // Calculate average
        double average = total / 5.0;

        // Display report
        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Student Name: " + name);

        for (int i = 0; i < 5; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        // Calculate grade
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
