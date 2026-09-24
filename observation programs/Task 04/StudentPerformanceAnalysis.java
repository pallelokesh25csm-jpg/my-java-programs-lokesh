import java.util.Scanner;

class Student {
    private int rollNumber;
    private String studentName;
    private int[] marks;

    // Constructor
    public Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Calculate total marks
    public int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate average marks
    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    // Find highest marks
    public int findHighest() {
        int highest = marks[0];

        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    // Find lowest marks
    public int findLowest() {
        int lowest = marks[0];

        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    // Calculate percentage
    public double calculatePercentage() {
        // Each subject is assumed to be out of 100
        double percentage = ((double) calculateTotal() / (marks.length * 100)) * 100;

        // Round to two decimal places
        return Math.round(percentage * 100.0) / 100.0;
    }

    // Determine grade
    public String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Determine pass/fail
    public String getResult() {
        return calculatePercentage() >= 50 ? "PASS" : "FAIL";
    }

    // Performance remark
    public String getRemark() {
        String grade = calculateGrade();

        switch (grade) {
            case "A+":
                return "Outstanding Performance";
            case "A":
                return "Excellent Performance";
            case "B":
                return "Very Good Performance";
            case "C":
                return "Good Performance";
            case "D":
                return "Satisfactory Performance";
            default:
                return "Needs Improvement";
        }
    }

    // Display student details
    public void displayDetails() {
        // String operations
        String formattedName = studentName.trim().toUpperCase();

        System.out.println("\n========================================");
        System.out.println("      STUDENT PERFORMANCE REPORT");
        System.out.println("========================================");

        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Student Name      : " + formattedName);
        System.out.println("Name Length       : " + formattedName.length());

        System.out.println("\nSubject Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + "         : " + marks[i]);
        }

        System.out.println("\nTotal Marks       : " + calculateTotal());
        System.out.println("Average Marks     : " + calculateAverage());
        System.out.println("Highest Marks     : " + findHighest());
        System.out.println("Lowest Marks      : " + findLowest());
        System.out.println("Percentage        : " + calculatePercentage() + "%");
        System.out.println("Grade             : " + calculateGrade());
        System.out.println("Result            : " + getResult());
        System.out.println("Performance Remark: " + getRemark());

        System.out.println("========================================");
    }
}

public class StudentPerformanceAnalysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("  STUDENT PERFORMANCE ANALYSIS SYSTEM");
        System.out.println("========================================");

        // Input student details
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        // Array to store marks of five subjects
        int[] marks = new int[5];

        System.out.println("\nEnter marks for 5 subjects:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Create Student object
        Student student = new Student(rollNumber, studentName, marks);

        // Display complete performance report
        student.displayDetails();

        sc.close();
    }
}
