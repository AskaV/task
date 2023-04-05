package com.aska.tasktests;

import java.util.*;
import java.util.stream.Collectors;

public class Task9 {

    public static List<String> task9Expres(List<String> wordList) {
        return wordList
                .stream()
                .map(string -> wordList
                    .stream()
                    .filter(string2 -> string2.charAt(0) == string.charAt(0))
                    .mapToInt(String::length)
                    .sum() + "-" + string.charAt(0))
                .distinct()//remove duplicats
                .sorted(Comparator.<String, String> comparing(s -> s.split("-")[0])
                        .reversed()
                        .thenComparing(String::valueOf)
                )
                .collect(Collectors.toList());
    }
}

