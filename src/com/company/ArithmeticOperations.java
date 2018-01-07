package com.company;

import java.util.Scanner;

public class ArithmeticOperations {

    public void addTwoIntegers(){
        System.out.println("Enter two integers");
        Scanner scanner=new Scanner(System.in);
        int op1=scanner.nextInt();
        int op2=scanner.nextInt();
        System.out.println("The sum of " + op1 +" and " + op2 + " is " + (op1+op2));
    }
}
