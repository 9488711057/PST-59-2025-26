/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int greatest;

        if (a > b && a > c) {
            greatest = a;
        } else if (b > c) {
            greatest = b;
        } else {
            greatest = c;
        }

        System.out.println("Greatest number: " + greatest);
    }
}

