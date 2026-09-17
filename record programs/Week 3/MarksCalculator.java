import java.util.Scanner;

public class MarksCalculator {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int total = 0;
    for ( int i = 1; i<=5; i++){
        System.out.println("enter marks of subject" + i +":");
        int marks=sc.nextInt();
        total=total+marks;
    }
    double average =(double)total/5;
    System.out.println("total marks =" + total);
    System.out.println("average marks=" +average);
   } 
}
