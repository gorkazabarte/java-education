package src.java.main.Chapter02;

import org.junit.Assert;
import src.java.main.Chapter02.TaskCh02N001;

public class TaskCh02N001Test {

    public static void testEvenNumber() {

        TaskCh02N001 o = new TaskCh02N001();
        Assert.assertEquals("TaskCh02N001.reverseNumber", o.reverseNumber(34521234), 43212543);
    }

    public static void testOddNumber() {

        TaskCh02N001 o = new TaskCh02N001();
        Assert.assertEquals("TaskCh02N001.reverseNumber", o.reverseNumber(123), 321);
    }

    public static void main(String [] args) {

        testEvenNumber();
        testOddNumber();

    }
}
