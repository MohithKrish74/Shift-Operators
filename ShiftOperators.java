package com.keyword;

import java.util.Scanner;

public class ShiftOperators
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = in.nextInt();
        System.out.println("The Bitwise Left Shift is "+(number1<<number2));
        System.out.println("The Bitwise Right Shift is "+(number2>>number2));
        System.out.println("The Bitwise Zero Fill Right Shift is "+(number1>>>number2));
    }
}
