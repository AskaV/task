package com.aska.tasktests;

import jdk.jfr.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.util.*;


public class Task6Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    @Description("Get a new sequence of strings with more than one character from the stringList, starting and ending with C")
    public void testFilterByFirstAndLastCharacter() {
        List<Integer> list1 = Arrays.asList(1, 3, 4);
        List<String> list2 = Arrays.asList("1aa", "aaa", "1", "a");
        Assert.assertEquals(Task6.task6Expres(list1, list2), Arrays.asList("1", "1aa", "Not Found"));
    }
}