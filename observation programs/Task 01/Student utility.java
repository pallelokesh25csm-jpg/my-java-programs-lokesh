import java.util.Scanner;

public class StudentUtility {

    static Scanner sc = new Scanner(System.in);

    // Part A: Student Information
    static void studentInfo() {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Total Marks: " + total + "/300");
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }

    // Part B: Even or Odd
    static void evenOdd() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    // Largest of Three Numbers
    static void largest() {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Largest = " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest = " + b);
        else
            System.out.println("Largest = " + c);
    }

    // Grade using if-else
    static void grade() {
        System.out.print("Enter percentage: ");
        double p = sc.nextDouble();

        if (p < 0 || p > 100)
            System.out.println("Invalid percentage");
        else if (p >= 90)
            System.out.println("Grade A");
        else if (p >= 75)
            System.out.println("Grade B");
        else if (p >= 60)
            System.out.println("Grade C");
        else if (p >= 40)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }

    // Day of the Week using switch
    static void dayOfWeek() {
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number");
        }
    }

    // Part C: Multiplication Table
    static void multiplicationTable() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    // Print numbers from 1 to N
    static void printNumbers() {
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // Sum of first N natural numbers
    static void naturalSum() {
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number");
            return;
        }

        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Sum = " + sum);
    }

    // Fibonacci Series
    static void fibonacci() {
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number");
            return;
        }

        long a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Part D: Parameterized methods returning results

    static long factorial(int n) {
        if (n < 0 || n > 20)
            return -1;

        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }

    static double circleArea(double radius) {
        if (radius < 0)
            return -1;

        return Math.PI * radius * radius;
    }

    // Main method
    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT UTILITY PROGRAM =====");
            System.out.println("1. Student Information");
            System.out.println("2. Even or Odd");
            System.out.println("3. Largest of Three Numbers");
            System.out.println("4. Calculate Grade");
            System.out.println("5. Day of the Week");
            System.out.println("6. Multiplication Table");
            System.out.println("7. Print Numbers 1 to N");
            System.out.println("8. Sum of First N Natural Numbers");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Factorial");
            System.out.println("11. Check Prime");
            System.out.println("12. Maximum of Two Numbers");
            System.out.println("13. Area of Circle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    studentInfo();
                    break;
                case 2:
                    evenOdd();
                    break;
                case 3:
                    largest();
                    break;
                case 4:
                    grade();
                    break;
                case 5:
                    dayOfWeek();
                    break;
                case 6:
                    multiplicationTable();
                    break;
                case 7:
                    printNumbers();
                    break;
                case 8:
                    naturalSum();
                    break;
                case 9:
                    fibonacci();
                    break;
                case 10:
                    System.out.print("Enter a number (0-20): ");
                    int n = sc.nextInt();
                    long f = factorial(n);
                    if (f == -1)
                        System.out.println("Enter a number from 0 to 20");
                    else
                        System.out.println("Factorial = " + f);
                    break;
                case 11:
                    System.out.print("Enter a number: ");
                    System.out.println(isPrime(sc.nextInt())
                            ? "Prime Number" : "Not a Prime Number");
                    break;
                case 12:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Maximum = " + maximum(a, b));
                    break;
                case 13:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    double area = circleArea(r);
                    if (area == -1)
                        System.out.println("Radius cannot be negative");
                    else
                        System.out.printf("Area = %.2f\n", area);
                    break;
                case 0:
                    System.out.println("Program terminated.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}