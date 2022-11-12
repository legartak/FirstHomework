package com.legartak.SecondTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.LinkedHashMap;

public class HashTagFinder {
    public static Map<String, Integer> findTop5Tags(List<String> listOfTexts) {
        if(listOfTexts == null) {
            return null;
        }

        Map<String, Integer> temp = new HashMap<>();

        for (String text: listOfTexts) {
            List<String> uniqueWords = Arrays.stream(text.split(" ")).distinct().toList();
            for (String word: uniqueWords) {
                if(word.startsWith("#")) {
                    if (temp.containsKey(word)) {
                        temp.put(word, temp.get(word) + 1);
                    } else {
                        temp.put(word, 1);
                    }
                }
            }
        }

        List<Map.Entry<String, Integer>> sortingList = new LinkedList<>(temp.entrySet());
        sortingList.sort((o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        sortingList.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        Map<String, Integer> result = new LinkedHashMap<>();
        if (sortingList.size() <= 5) {
            for (Map.Entry<String, Integer> sortedEntry: sortingList) {
                result.put(sortedEntry.getKey(), sortedEntry.getValue());
            }
        } else {
            for (int i = sortingList.size() - 5; i < sortingList.size(); i++) {
                result.put(sortingList.get(i).getKey(), sortingList.get(i).getValue());
            }
        }

        return result;
    }
}
