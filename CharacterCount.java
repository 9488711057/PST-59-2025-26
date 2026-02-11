package pst;
import java.util.Scanner;

public class CharacterCount {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();

	        int count = str.length();

	        System.out.println("Character count = " + count);
	        
	        sc.close();
	    }
}
