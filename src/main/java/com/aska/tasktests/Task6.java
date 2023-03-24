package com.aska.tasktests;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    public static Object task6Expres(List<Integer> wordList1, List<String> wordList2) {
        var k =wordList2
                .stream()
                .filter(str -> Character.isDigit(str.charAt(0)))
                .collect(Collectors.toList());
        return  k;
    }
}

