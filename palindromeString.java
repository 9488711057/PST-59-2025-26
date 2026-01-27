package pst;
import java.util.Scanner;

public class palindromeString {
	public static void main(String[]args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter a String:");
		String str = sc.nextLine();
		int n = str.length();
		String rev ="";
		for (int i=n-1;i>=0;i--) {
			rev = rev + str. charAt(i);
		}
		if (str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
	