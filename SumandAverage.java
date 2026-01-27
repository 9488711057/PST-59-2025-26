package pst;
import java.util.Scanner;

public class SumandAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        

        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++)
            sum += sc.nextInt();

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / (double)n));
    }
}



