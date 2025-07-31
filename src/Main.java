import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hi! Let's get to know you a little bit.");
        System.out.print("Enter your Student ID: ");
        String studentId = input.nextLine();

        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Course: ");
        String course = input.nextLine();

        System.out.print("Section: ");
        String section = input.nextLine();

        System.out.println("STUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.println("\nNow, let’s enter your scores. Please be honest.");

        System.out.print("Midterm Exam Score (out of 100): ");
        int midterm = input.nextInt();

        System.out.print("Final Exam Score (out of 100): ");
        int finals = input.nextInt();

        System.out.print("Project Score (out of 100): ");
        int project = input.nextInt();

        System.out.print("Attendance Percentage (out of 100): ");
        int attendance = input.nextInt();

        int totalScore = midterm + finals + project + attendance;
        double averageScore = totalScore / 4.0;

        String remarks = (averageScore < 75) ? "FAILED" : "PASSED";

        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midterm);
        System.out.println("Final Exam Score: " + finals);
        System.out.println("Project Score: " + project);
        System.out.println("Attendance Score: " + attendance);
        System.out.printf("Average Score: %.2f\n", averageScore);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}