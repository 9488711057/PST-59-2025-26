package pst;

import java.util.Scanner;

public class Givenchar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        printAscii(ch);
    }

    public static void printAscii(char ch) {
        int ascii = ch;  
        System.out.println("ASCII value of " + ch + " is: " + ascii);
    }
}