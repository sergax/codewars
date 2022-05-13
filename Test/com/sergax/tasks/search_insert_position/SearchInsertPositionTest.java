package com.sergax.tasks.search_insert_position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * by Aksenchenko Serhii on 04.05.2022
 */
class SearchInsertPositionTest {

    @Test
    public void TestSearchPosition() {
        SearchInsertPosition sp = new SearchInsertPosition();
        System.out.println(sp.searchInsert(new int[]{1, 2, 5, 6}, 1));
        assertEquals(2, sp.searchInsert(new int[]{1, 2, 5, 6}, 5));
    }
}