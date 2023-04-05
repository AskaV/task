package com.aska.tasktests;

import jdk.jfr.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;


public class Task9Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void testFilterByFirstAndLastCharacter() {
        List<String> list = Arrays.asList("BCD", "B", "ABC", "A", "D", "HRE");
        Assert.assertEquals(Task9.task9Expres(list), Arrays.asList("4-A", "4-B", "3-H", "1-D"));
    }
}