package com.aska.tasktests;

import jdk.jfr.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;


public class Task8Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void testFilterByFirstAndLastCharacter() {
        List<Integer> list = Arrays.asList(-10, 3, -3, 4, 55, 6);
        Assert.assertEquals(Task8.task8Expres(3, 4, list), Arrays.asList(55, 6, 4));
    }
}