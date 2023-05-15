package com.getjavaobj.training.algo.init.gzabarte;

import com.getjavaobj.training.algo.init.gzabarte.TaskCh02N0013;
import org.junit.Assert;

public class TaskCh02N0013Test {

    public static void testEvenNumber() {
        TaskCh02N0013 o = new TaskCh02N0013();
        Assert.assertEquals("TaskCh02N001.reverseNumber", o.reverseNumber(34521234), 43212543);
        Assert.assertEquals("TaskCh02N001.reverseNumber", o.reverseNumber(1000), 1);
    }

    public static void testOddNumber() {
        TaskCh02N0013 o = new TaskCh02N0013();
        Assert.assertEquals("TaskCh02N001.reverseNumber", o.reverseNumber(123), 321);
    }

    public static void main(String [] args) {
        testEvenNumber();
        testOddNumber();

    }
}
