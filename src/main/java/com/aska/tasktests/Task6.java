package com.aska.tasktests;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6 {

    public static Object task6Expres(List<Integer> wordList1, List<String> wordList2) {

    return  wordList1
                .stream()
                .filter(Objects::nonNull)
                .map(intStr -> wordList2
                        .stream()
                        .filter(str2 -> str2.length() > 0
                                & str2.length() == intStr
                                & Character.isDigit(str2.charAt(0)))
                        .findFirst())
                .flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.of("Not Found"))
                .collect(Collectors.toList());
    }
}

