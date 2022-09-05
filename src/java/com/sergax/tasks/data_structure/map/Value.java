package com.sergax.tasks.data_structure.map;

import java.util.Objects;

/**
 * @author: sergax
 * @date: 01.08.22
 */
public class Value {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value1 = (Value) o;
        return value == value1.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
