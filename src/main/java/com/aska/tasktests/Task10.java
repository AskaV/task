package com.aska.tasktests;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {

    public static Object task10Expres(List<String> wordList) {

    return  wordList
                    .stream()
                    .sorted(Comparator.comparing(String::length, Comparator.reverseOrder()))
                    .map(String::toUpperCase)
                    .map(str->str.charAt(str.length()-1))
                    .collect(Collectors.toList());
    }

}
//    public static List<Character> getSequenceOfCharactersSortedByInitialLengthOfString(List<String> strings) {
//        return strings.stream()
//                .sorted((a, b) -> -Integer
//                .compare(a.length(), b.length())).
//                map(string -> Character.toUpperCase(string.charAt(string.length() - 1)))
//                .collect(Collectors.toList());
//    }

