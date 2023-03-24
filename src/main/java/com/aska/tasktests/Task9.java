package com.aska.tasktests;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task9 {

    public static Object task9Expres(List<String> wordList) {
        var k = wordList
                .stream()
                .map(str -> new AbstractMap.SimpleEntry<>(str.charAt(0), str.length()))
                .collect(
                        Collectors.collectingAndThen(Collector.of((Supplier<HashMap<Character, Integer>>) HashMap::new,
                                        (map, entry) -> {
                                            int prevSize = map.getOrDefault(entry.getKey(), 0);
                                            map.put(entry.getKey(), prevSize + entry.getValue());
                                        },
                                        (a, b) -> {
                                            throw new UnsupportedOperationException();
                                        }),
                                map -> map.entrySet()
                                        .stream()))
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(entry -> entry.getValue() + "-" + entry.getKey())
                .collect(Collectors.toList());
    return k;
    }


}

