package main.java.com.getjavajob.training.algo.init.gzabarte;

public class TaskCh02N0013 {

    public static int reverseNumber(int number) {
        String castToStr = Integer.toString(number);
        String reversedNumber = "";
        for (int i = castToStr.length() - 1; i >= 0; i--) {
            reversedNumber += castToStr.charAt(i);
        }

        return Integer.parseInt(reversedNumber);
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(100));
    }

}

