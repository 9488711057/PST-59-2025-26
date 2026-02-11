package pst;
import java.util.Scanner;

public class ChartoString {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter a character: ");
    	char ch = sc.next().charAt(0);

        String str = "" + ch;

        System.out.println("String value: " + str);
    }
}
