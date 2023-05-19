package com.getjavaobj.training.algo.init.gzabarte;

import com.getjavaobj.training.algo.util.Assert;

public class TaskCh02N013Test {
    public static void testEvenNumber() {
        TaskCh02N013 o = new TaskCh02N013();
        Assert.assertEquals("TaskCh02N001.reverseNumber", 543, o.reverseNumber(345));
        Assert.assertEquals("TaskCh02N001.reverseNumber", 1, o.reverseNumber(100));
    }

    public static void testOddNumber() {
        TaskCh02N013 o = new TaskCh02N013();
        Assert.assertEquals("TaskCh02N001.reverseNumber", o.reverseNumber(123), 321);
    }

    public static void main(String [] args) {
        testEvenNumber();
        testOddNumber();
    }
}
