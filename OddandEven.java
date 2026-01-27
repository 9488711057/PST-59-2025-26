package pst;
import java.util.Scanner;
public class OddandEven {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

    int even = 0, odd = 0;

    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();

    System.out.println("Enter elements:");
    for (int i = 0; i < n; i++) {
        int num = sc.nextInt();
        if (num % 2 == 0)
            even++;
        else
            odd++;
    }

    System.out.println("Even =" + even);
    System.out.println("Odd = " + odd);
	}
       
}
