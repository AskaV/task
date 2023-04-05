package com.aska.tasktests;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task8 {

    public static List<Integer> task8Expres(int d, int k, List<Integer> wordList) {
        return new TreeSet<Integer>() {
            {
                addAll(wordList.subList(k, wordList.size()));
                addAll(wordList.stream().filter(el -> el > d).collect(Collectors.toList()));
            }
        }.stream().sorted((el1, el2) -> -Integer.compare(el1, el2)).collect(Collectors.toList());
    }

}

