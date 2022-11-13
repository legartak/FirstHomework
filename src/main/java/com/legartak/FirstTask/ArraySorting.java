package com.legartak.FirstTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ArraySorting {
    public static Integer[] onlyPositiveDescending(Integer[] inputArray) {
        Objects.requireNonNull(inputArray);

        return Arrays.stream(inputArray)
                .sorted(((o1, o2) -> o2-o1))
                .filter(obj -> obj >= 0)
                .collect(Collectors.toCollection(ArrayList::new))
                .toArray(Integer[]::new);
    }
}
