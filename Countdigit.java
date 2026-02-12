package pst;
import java.util.Scanner;

public class Countdigit {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the digit:");
		int num=sc.nextInt();
		
		int count =0;
		
		while (num!=0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count Digit = " + count);
		
		sc.close();
		 
	}

}
