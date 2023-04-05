package com.aska.tasktests;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {

    public static Object task7Expres(int k, List<Integer> integerList) {
        return new ArrayList<Integer>() {
            {
                addAll(integerList
                        .subList(k, integerList.size())
                        .stream()
                        .filter(elSet1 -> (integerList
                                .stream()
                                .filter(elementSet2 -> elementSet2 % 2 == 0))
                                .noneMatch(elementSet2 -> elementSet2.equals(elSet1)))
                        .collect(Collectors.toList()));
                addAll(integerList
                        .stream()
                        .filter(elementSet2 -> elementSet2 % 2 == 0)
                        .filter(elementSet2 -> integerList
                                .subList(k, integerList.size())
                                .stream()
                                .noneMatch(elSet1 -> elSet1.equals(elementSet2)))
                        .collect(Collectors.toList()));
            }
        }.stream().sorted((el1, el2) -> Integer.compare(el1, el2) * (-1)).collect(Collectors.toList());


}
