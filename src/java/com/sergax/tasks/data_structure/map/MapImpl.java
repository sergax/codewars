package com.sergax.tasks.data_structure.map;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author: sergax
 * @date: 01.08.22
 */
public class MapImpl implements Map<Key, Value> {
    LinkedList<Entry>[] hashMAp = new LinkedList[2];
    int size = 0;

    public MapImpl() {
    }

    private void resize() {
        if (size >= hashMAp.length) {
            LinkedList<Entry>[] oldMap = hashMAp;
            hashMAp = new LinkedList[size * 2];
            size = 0;

            for (int i = 0; i < oldMap.length; i++) {
                if (oldMap[i] == null) continue;
                for (Entry entry : oldMap[i]) {
                    put(entry.key, entry.value);
                }
            }
        }
    }


    @Override
    public void put(Key key, Value value) {
        resize();
        int index = getIndex(key) % hashMAp.length;

        if (hashMAp[index] == null) {
            hashMAp[index] = new LinkedList<>();
            hashMAp[index].add(new Entry(key, value));
            size++;
        } else {
            for (Entry entry : hashMAp[index]) {
                if (entry.key.equals(value)) {
                    entry.value = value;
                    size++;
                    return;
                }
            }
        }
        hashMAp[index].add(new Entry(key, value));
        size++;
    }

    @Override
    public int getIndex(Key key) {
        return key.hashCode();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Value get(Key key) {
        int index = getIndex(key) % hashMAp.length;
        if (hashMAp[index] == null) return null;

        for (Entry entry : hashMAp[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    @Override
    public void remove(Key key) {
        if (key == null) return;
        int index = getIndex(key) % hashMAp.length;
        if (hashMAp[index] == null) return;
        Entry toRemove = null;

        for (Entry entry : hashMAp[index]) {
            if (entry.key.equals(key)) {
                toRemove = entry;
                break;
            }
        }
        if (toRemove == null) return;
        hashMAp[index].remove(toRemove);
        size--;
    }

    @Override
    public boolean containsKey(Key key) {
        if (key == null) return false;
        int index = getIndex(key) % hashMAp.length;
        if (hashMAp[index] == null) return false;

        for (Entry entry : hashMAp[index]) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MapImpl{" +
                "hashMAp=" + Arrays.toString(hashMAp) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        MapImpl map = new MapImpl();
        map.put(new Key(10), new Value(5));
        map.put(new Key(14), new Value(15));
        map.put(new Key(19), new Value(55));
        map.put(new Key(101), new Value(555));
        System.out.println(map.get(new Key(10)).toString());
        System.out.println(map.containsKey(new Key(10)));
    }
}
