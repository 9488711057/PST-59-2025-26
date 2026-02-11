package pst;
import java.util.Scanner;
public class ChartoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character:");
		char character = sc.next().charAt(0);
		char[] arr = new char[1];
        arr[0] = character;

        System.out.println("Convert character to Array: " + arr[0]);

        sc.close();
	}

}