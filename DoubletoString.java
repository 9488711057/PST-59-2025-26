package pst;
import java.util.Scanner;
public class DoubletoString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Double value:");
		double num = sc.nextDouble();

        String str = "";
        long intPart = (long) num; 
        double decPart = num - intPart;
        str = str + ".";

        
        for (int i = 0; i < 2; i++) {
            decPart = decPart * 10;
            int digit = (int) decPart;
            char ch = (char)(digit + 48); 
            str = str + ch;
            decPart = decPart - digit;
        }

        System.out.println("String Value is: " + str);
        sc.close();

	}

}
