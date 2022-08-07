package com.sergax.tasks.data_structure.map;

import java.util.Objects;

/**
 * @author: sergax
 * @date: 01.08.22
 */
public class Key {
    private int key;
    public Key(int key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key1 = (Key) o;
        return Objects.equals(key, key1.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
