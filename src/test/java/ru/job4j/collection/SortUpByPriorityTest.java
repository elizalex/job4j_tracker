package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortUpByPriorityTest {

    @Test
    public void compare() {
        List<Job> input = Arrays.asList(
                new Job("Make bug", 1),
                new Job("Fix bug", 4),
                new Job("X task", 2),
                new Job("Fix bug", 3)
        );
        input.sort(new SortUpByPriority());
        assertEquals(input.get(0).getPriority(), 1);
        assertEquals(input.get(1).getPriority(), 2);
        assertEquals(input.get(2).getPriority(), 3);
        assertEquals(input.get(3).getPriority(), 4);
    }
}