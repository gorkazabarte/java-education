package src.java.main.Chapter01;

import java.util.Scanner;

public class TaskCh01N001 {

    public static Scanner openStdIn() {
        /*
        Start reading from stdin and send opening message in console.
        */

        Scanner in = new Scanner(System.in);
        System.out.println(
                "Reading integers from standard input (console).\n" +
                "Enter a negative number and we will stop reading from console.\n"
        );

        return in;
    }

    public static void readStdInput() {
        /*
        Read from stdin until user entered something
        that it is not an integer.
         */

        Scanner in = openStdIn();

        while(in.hasNextInt()) {
            try {
                String next = in.next();
                System.out.println(String.format("You have entered a number %d.\n", Integer.parseInt(next)));
                System.out.println("Again\n");
            } catch(Exception e) {
                System.out.println(String.format("Exception %s.\n"));
                System.out.println(String.format("The text you entered is not an Integer.\n", e));
            }
        }

        System.out.println(String.format("You have not entered a number.\n"));
        System.out.println("Stop reading from console\n");
        in.close();
    }


    public static void main(String[] args) {

        readStdInput();

    }
}
