package com.legartak.SecondTask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HashTagFinderTest {
    @Test
    @DisplayName("Provided null-value to method")
    void testNullGiven() {
        Map<String, Integer> result = HashTagFinder.findTop5Tags(null);
        assertNull(result);
    }

    @Test
    @DisplayName("Provided empty list of texts to method")
    void testEmptyListGiven() {
        List<String> input = new ArrayList<>();
        Map<String, Integer> expected = new LinkedHashMap<>();
        Map<String, Integer> result = HashTagFinder.findTop5Tags(input);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Provided text with no hashtags to method")
    void testEmptyWillBeReturned() {
        List<String> input = Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaaa bbbbbbbbbbbbbb yey hooray");
        Map<String, Integer> expected = new LinkedHashMap<>();
        Map<String, Integer> result = HashTagFinder.findTop5Tags(input);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Provided one text with a lot of one hashtag to method")
    void testALotTagsInOneText() {
        List<String> input = Arrays.asList("#a #a #a #a #a #a #a");
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("#a", 1);
        Map<String, Integer> result = HashTagFinder.findTop5Tags(input);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Provided texts with and without hashtags to method")
    void testMixedTexts() {
        List<String> input = Arrays.asList("#Your rate #is 4. It #is good rate for #your first day at this position. Keep #going",
                "It #is very nice to see #you here. It #is #very #important #for me.",
                "Where are #you going?",
                "We are notifying #you that #your social credit was decreased by -1000.");
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("#very", 1);
        expected.put("#important", 1);
        expected.put("#is", 2);
        expected.put("#your", 2);
        expected.put("#you", 3);

        Map<String, Integer> result = HashTagFinder.findTop5Tags(input);

        assertEquals(expected, result);
    }
}
