package org.lcwd.test.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorServiceTest
{
     @BeforeClass
     public static void init(){
         System.out.println("Before all test cases :");
     }





//test method of addtwoNumbers
    @Test
    public  void  addTwoNumbersTest(){
        int result = CalculatorService.addTwoNumbers(12, 45);
        int expected = 57 ;

        Assert.assertEquals(expected , result);

        //actual result

        //expected result






    }







}
