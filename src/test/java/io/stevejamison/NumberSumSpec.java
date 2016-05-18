package io.stevejamison;


import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;

/**
 * Created by stevejaminson on 5/18/16.
 */
public class NumberSumSpec {

    @Test
    public void PromtUserTest(){
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        NumberSum num = new NumberSum();
        int expected = 5;
        int actual = num.promptUser("Enter a number: ");
        assertEquals("Number entered should be 5", expected, actual);
    }

    @Test
    public void addNumbersTest(){
        NumberSum num = new NumberSum();
        int expected = 6;
        int actual = num.addNumbers(3);
        assertEquals("Total should be 6",expected,actual);
    }

    @Test
    public void runTest(){
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        NumberSum num = new NumberSum();
        int expected = 15;
        int actual = num.run();
        assertEquals("Total should be 15",expected,actual);
    }

}
