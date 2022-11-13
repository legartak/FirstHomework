package com.legartak.SecondTask;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Collectors;

public class HashTagFinder {
    public static Map<String, Integer> findTop5Tags(List<String> texts) {
        Objects.requireNonNull(texts);

        Map<String, Integer> temp = new HashMap<>();

        texts.stream().flatMap(text -> Arrays.stream(text.split(" "))
                .distinct()).
                filter(word -> word.startsWith("#"))
                .forEach(obj -> temp.compute(obj, (key, value) -> value == null ? 1 : value + 1));


        List<Map.Entry<String, Integer>> sortingList = new LinkedList<>(temp.entrySet());
        sortingList.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        sortingList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        return sortingList.stream()
                .limit(5)
                .sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o2, LinkedHashMap::new));
    }
}
