package com.legartak.FirstTask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArraySortingTest {

    @Test
    @DisplayName("Exception should be returned")
    void testNullGiven() {
        assertThrows(NullPointerException.class, () -> {ArraySorting.onlyPositiveDescending(null);});
    }

    @Test
    @DisplayName("Empty array should be returned")
    void testEmptyArrayToMethod() {
        Integer[] result = ArraySorting.onlyPositiveDescending(new Integer[0]);
        assertArrayEquals(new Integer[0], result);
    }

    @Test
    @DisplayName("Empty array should be returned")
    void testAllNegativeArray() {
        Integer[] inputArray = {-200, -1, -100, -5, -1000};
        Integer[] result = ArraySorting.onlyPositiveDescending(inputArray);
        Integer[] expected = new Integer[0];
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Positive ascending array of Integers should be returned")
    void testAllPositiveAscending() {
        Integer[] inputArray = {1, 2, 10, 15, 40};
        Integer[] result = ArraySorting.onlyPositiveDescending(inputArray);
        Integer[] expected = {40, 15, 10, 2, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Positive descending array of Integers should be returned")
    void testDescendingPositiveArray() {
        Integer[] inputArray = {100, 10, 5, 3, 2, 1};
        Integer[] result = ArraySorting.onlyPositiveDescending(inputArray);
        Integer[] expected = {100, 10, 5, 3, 2, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Sorted array of mixed values 1 should be returned")
    void testCaseAllMixed1() {
        Integer[] inputArray = {90, -1, -100, 500, 1, 4, 222};
        Integer[] result = ArraySorting.onlyPositiveDescending(inputArray);
        Integer[] expected = {500, 222, 90, 4, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Sorted array of mixed values 2 should be returned")
    void testCaseAllMixed2() {
        Integer[] inputArray = {0, -500, 9000, 100, 45,-9, 3};
        Integer[] result = ArraySorting.onlyPositiveDescending(inputArray);
        Integer[] expected = {9000, 100, 45, 3, 0};
        assertArrayEquals(expected, result);
    }
}