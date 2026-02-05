package pst;
import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		int square = num * num;
        int temp = num;

        boolean isAutomorphic = true;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp = temp / 10;
            square = square / 10;
        }
        
        if(isAutomorphic)
        	System.out.println("It is Automorphic");
        else
        	System.out.println("It is not Automorphic");
        
        sc.close();
        }

}
