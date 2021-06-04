package com.epam.test.automation.java.practice1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
   
    @Test
    public void testTask1PositiveBoundaryValue() {
        Assert.assertEquals(Main.task1(1), 1, "Should return 1");
    }

    @Test
    public void testTask1NegativeBoundaryValue() {
        Assert.assertEquals(Main.task1(-1), 1, "Should return 1");
    }

    @Test
    public void testTask1Zero() {
        Assert.assertEquals(Main.task1(0), 0, "Should return 0");
    }

    @Test
    public void testTask1Pow() {
        Assert.assertEquals(Main.task1(4), 16, "Should return squared number");
    }

    @Test
    public void testTask1Abs() {
        Assert.assertEquals(Main.task1(-2), 2, "Should return modulus of a number");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask2ShouldThrowExceptionWhenNLessThan100() {
        Main.task2(99);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTask2ShouldThrowExceptionWhenNMoreThan999() {
        Main.task2(1000);
    }

    @Test
    public void testTask2ShouldReturnMax321WhenN123() {
        Assert.assertEquals(Main.task2(123), 321, "Should return maximum integer");
    }

    @Test
    public void testTask2ShouldReturnMax321WhenN321() {
        Assert.assertEquals(Main.task2(321), 321, "Should return maximum integer");
    }

    @Test
    public void testTask2ShouldReturnMax111WhenN111() {
        Assert.assertEquals(Main.task2(111), 111, "Should return maximum integer");
    }

    @Test
    public void testTask2ShouldReturnMax118WhenN811() {
        Assert.assertEquals(Main.task2(118), 811, "Should return maximum integer");
    }
}