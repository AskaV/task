package com.aska.tasktests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;


public class Task10Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void testFilterByFirstAndLastCharacter() {
        List<String> list = Arrays.asList("asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop");
        Assert.assertEquals(Task10.task10Expres(list), Arrays.asList('U', 'D', 'B', 'B', 'F', 'P', 'S', 'A'));
    }
}