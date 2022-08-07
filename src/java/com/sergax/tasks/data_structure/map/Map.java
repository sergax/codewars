package com.sergax.tasks.data_structure.map;

/**
 * @author: sergax
 * @date: 01.08.22
 */
public interface Map<Key, Value> {
    void put(Key key, Value value);
    Value get(Key key);
    void remove(Key key);
    boolean containsKey(Key key);
    int getIndex(Key key);
    int size();
}
