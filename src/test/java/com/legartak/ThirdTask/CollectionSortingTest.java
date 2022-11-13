package com.legartak.ThirdTask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class CollectionSortingTest {

    @Test
    @DisplayName("Exception should be returned")
    void testNullGiven() {
        assertThrows(NullPointerException.class, () -> {Figure.collectionSorting(null);});
    }

    @Test
    @DisplayName("Empty collection should be returned")
    void testEmptyCollection() {
        List<Figure> result = Figure.collectionSorting(new ArrayList<>());
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    @DisplayName("Small collection should be returned")
    void testSmallCollection() {
        List<Figure> inputArray= new ArrayList<>(3);
        inputArray.add(new Cube(15));
        inputArray.add(new Cube(2));
        inputArray.add(new Cube(4));
        List<Figure> expected = Arrays.asList(new Cube(2), new Cube(4), new Cube(15));
        List<Figure> result = Figure.collectionSorting(inputArray);
        assertIterableEquals(expected, result);
    }

    @Test
    @DisplayName("Sorted mixed objects should be returned")
    void testMixedCollection() {
        List<Figure> inputArray= new ArrayList<>(5);
        inputArray.add(new Cube(2));
        inputArray.add(new RectangularPrism(7, 5, 4));
        inputArray.add(new Cylinder(9, 5));
        inputArray.add(new TriangularPrism(190, 5));
        inputArray.add(new Cube(15));
        List<Figure> expected = Arrays.asList(new Cube(2), new RectangularPrism(7, 5, 4),
                new TriangularPrism(190, 5), new Cylinder(9, 5), new Cube(15));
        List<Figure> result = Figure.collectionSorting(inputArray);
        assertIterableEquals(expected, result);
    }
}
