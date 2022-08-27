package com.pingan.testng.suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest(String name, int age){
        System.out.println("name = " + name + "age = " + age);
    }
}
