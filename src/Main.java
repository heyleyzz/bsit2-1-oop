public class Main {
    public static void main(String[] args) {
        // Create GradeCalculator object
        GradeCalculator calculator = new GradeCalculator();

        // Sample student
        String studentName = "John Smith";
        double average = calculator.calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = calculator.getLetterGrade(average);

        // Display using both overloaded methods
        System.out.println("first displayResult");
        calculator.displayResult(studentName, average);

        System.out.println("\nUsing second displayResult");
        calculator.displayResult(studentName, average, letterGrade);
    }
}

