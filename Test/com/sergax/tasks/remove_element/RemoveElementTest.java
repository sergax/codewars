package com.sergax.tasks.remove_element;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {

    @Test
    public void TestRemoveElement() {
        SolvingRemoveElement solving = new SolvingRemoveElement();
        assertEquals(5, solving.removeElement(new int[]{1,2,5,6,8,7,5}, 5));
    }
}
