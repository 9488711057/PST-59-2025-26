/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	   int mark = 78;  

        if (mark >= 90) {
            System.out.println("A Grade");
        }
        else if (mark >= 75) {
            System.out.println("B Grade");
        }
        else if (mark >= 50) {
            System.out.println("C Grade");
        }
        else {
            System.out.println("Fail");
        }
    }
}