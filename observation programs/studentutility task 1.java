package task1;
import java.util.Scanner;

public class StudentUtilityProgram {

  int factorial(int n) {
    int fact = 1;
     for(int i = 1; i <= n; i++) {
       fact *= i;
     }
     return fact;
  }

     boolean prime(int n) {
      if (n <= 1) {
        return false;
      }

      for (int i=2; i <= n; i++) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
     }

     int max(int a, int b) {
      return (a > b) ? a : b;
     }

     double areaOfCircle(double r) {
      return Math.PI * r * r;
     }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    StudentUtilityProgram util = new StudentUtilityProgram();

    do {
      System.out.println("\n===== Student Utility Program =====");
      System.out.println("1. Student Information");
      System.out.println("2. Even or Odd");
      System.out.println("3. Largest of Three Numbers");
      System.out.println("4. Grade based on percentage");
      System.out.println("5. Day of a week");
      System.out.println("6. Multiplication Tales");
      System.out.println("7. Numbers from 1 to N");
      System.out.println("8. Sum of first N natural numbers");
      System.out.println("9. Fibonacci Series");
      System.out.println("10. Factorial of a number");
      System.out.println("11. Prime number check");
      System.out.println("12. Max of Two Numbers");
      System.out.println("13. Area of Circle");
      System.out.println("0. Exit");

      System.out.print("Enter your choice: ");
      choice = sc.nextInt();

      switch (choice) {

        case 1: 
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter student marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int totalMarks = m1 + m2 + m3;
        double percentage = (totalMarks / 3.0);

        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        break;

        case 2:
          System.out.print("Enter a number: ");
          int num = sc.nextInt();
          if (num % 2 == 0) {
            System.out.println(num + " is even.");
          } else {
            System.out.println(num + " is odd.");
          }
          break;

          case 3:
            System.out.print("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt(); 
            int c = sc.nextInt();

            if(a>b && a>c) {
              System.out.println(a + " is the largest number.");
            } else if(b>c) {
              System.out.println(b + " is the largest number.");
            } else {
              System.out.println(c + " is the largest number.");
            }
            break;

            case 4:
              System.out.print("Enter percentage: ");
              double per = sc.nextDouble();

              if(per >= 90) {
                System.out.println("Grade: A");
              } else if(per >= 80) {
                System.out.println("Grade: B");
              } else if(per >= 70) {
                System.out.println("Grade: C");
              } else if(per >= 60) {
                System.out.println("Grade: D");
              } else {
                System.out.println("Grade: F");
              }
              break;

              case 5:
                System.out.print("Enter day number (1-7): ");
                int day = sc.nextInt();

                switch(day) {
                  case 1:
                    System.out.println("Monday");
                    break;
                  case 2:
                    System.out.println("Tuesday");
                    break;
                  case 3:
                    System.out.println("Wednesday");
                    break;
                  case 4:
                    System.out.println("Thursday");
                    break;
                  case 5:
                    System.out.println("Friday");
                    break;
                  case 6:
                    System.out.println("Saturday");
                    break;
                  case 7:
                    System.out.println("Sunday");
                    break;
                  default:
                    System.out.println("Invalid day number.");
                }
                break;

                case 6:
                  System.out.print("Enter a number for multiplication table: ");
                  int n = sc.nextInt();
                  System.out.println("Multiplication Table of " + n + ":");
                  for(int i=1; i<=10; i++) {
                    System.out.println(n + " x " + i + " = " + (n*i));
                  }
                  break;

                case 7:
                  System.out.print("Enter a number N: ");
                  int N = sc.nextInt();
                  System.out.println("Numbers from 1 to " + N + ":");
                  for(int i=1; i<=N; i++) {
                    System.out.print(i + " ");
                  }
                  System.out.println();
                  break;

                case 8:
                  System.out.print("Enter a number N: ");
                  int N1 = sc.nextInt();
                  int sum = 0;
                  for(int i=1; i<=N1; i++) {
                    sum += i;
                  }
                  System.out.println("Sum of first " + N1 + " natural numbers: " + sum);
                  break;  

                case 9:
                  System.out.print("Enter a number N: ");
                  int N2 = sc.nextInt();
                  int x = 0, y = 1;
                  System.out.println("Fibonacci Series up to " + N2 + ":");
                  while(x <= N2 ) {
                    System.out.print(x + " ");
                    int next = x + y;
                    x = y;
                    y = next;
                  }
                  System.out.println();
                  break;

                  case 10:
                    System.out.print("Enter a number: ");
                    int N3 = sc.nextInt();
                    int fact = util.factorial(N3);
                    System.out.println("Factorial of " + N3 + " is: " + fact);
                    break;

                  case 11:
                    System.out.print("Enter a number: ");
                    int N4 = sc.nextInt();
                    boolean isPrime = util.prime(N4);
                    if(isPrime) {
                      System.out.println(N4 + " is a prime number.");
                    } else {
                      System.out.println(N4 + " is not a prime number.");
                    }

                    case 12:
                      System.out.print("Enter two numbers: ");
                      int N5 = sc.nextInt();
                      int N6 = sc.nextInt();
                      int max = util.max(N5, N6);
                      System.out.println("Maximum of " + N5 + " and " + N6 + " is: " + max);
                      break;

                      case 13:
                        System.out.print("Enter radius of the circle: ");
                        double r = sc.nextDouble();
                        double area = util.areaOfCircle(r);
                        System.out.println("Area of the circle with radius " + r + " is: " + area);
                        break;

                        case 0:
                          System.out.println("Exiting the program.");
                          break;

        default:
          System.out.println("Invalid choice. Please try again.");
          }
    } while (choice != 0);

  sc.close();
  } 
}