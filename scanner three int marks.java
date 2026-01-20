/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark1, mark2, mark3;
        int total;
        float average;
        System.out.print("Enter mark 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter mark 3: ");
        mark3 = sc.nextInt();
        total = mark1 + mark2 + mark3;
        average = total / 3.0f;
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        sc.close();
    }
}

