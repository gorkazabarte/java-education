package com.getjavaobj.training.algo.init.gzabarte;

public class TaskCh02N013 {
    /**
     * Reverse a number
     *
     * @param number integer to reverse
     * @return number reversed
     */
    public static int reverseNumber(int number) {
        String number_str = Integer.toString(number);
        StringBuilder reversedNumber = new StringBuilder();
        for (int i = number_str.length() - 1; i >= 0; i--) {
            reversedNumber.append(number_str.charAt(i));
        }
        return Integer.parseInt(reversedNumber.toString());
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(506));
    }
}
