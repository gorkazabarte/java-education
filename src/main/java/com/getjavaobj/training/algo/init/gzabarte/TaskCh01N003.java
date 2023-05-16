package com.getjavaobj.training.algo.init.gzabarte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskCh01N003 {

    public static void readNumberFromStdInput() {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);

        try {
            int next = in.nextInt();
            System.out.printf("You have entered a number %d.", next);
        } catch(InputMismatchException e) {
            System.out.println("The text you entered is not an Integer.");
        }
    }

    public static void main(String[] args) {
        readNumberFromStdInput();
    }
}
