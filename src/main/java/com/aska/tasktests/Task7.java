package com.aska.tasktests;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {

    public static Object task7Expres(int number, List<Integer> wordList) {

    return  wordList
            .stream()
            .skip(number)
            .filter(str -> str % 2 == 0)
            .distinct()//возвращает только уникальные елементыы потока
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
    }


}
