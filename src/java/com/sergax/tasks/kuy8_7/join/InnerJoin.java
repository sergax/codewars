package com.sergax.tasks.kuy8_7.join;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * @author: sergax
 * @date: 05.08.22
 */
public class InnerJoin {


    static void join(Map<Entry, List<String>> map, Map<Entry, String> map2) {
        for (Map.Entry<Entry, String> key : map2.entrySet()) {
            Entry key1 = key.getKey();
            String value = key.getValue();
            map.put(key1, List.of(value));
        }
    }


    public static void main(String[] args) {
        Entry entry = new Entry();
        Entry entry1 = new Entry();
        Entry entry2 = new Entry();
        entry.setNumber(0);
        entry1.setNumber(1);
        entry2.setNumber(2);

        entry.setList(List.of("Ukraine"));
        entry1.setList(List.of("Germany"));
        entry2.setList(List.of("France"));

        Map<Entry, List<String>> hashMap = new HashMap<>();
        Map<Entry, String> hashMap2 = new HashMap<>();

        hashMap.put(entry, List.of("Ukraine"));
        hashMap.put(entry1, List.of("Germany"));
        hashMap.put(entry2, List.of("France"));

        hashMap2.put(entry, "Kyiv");
        hashMap2.put(entry1, "Berlin");
        hashMap2.put(entry2, "Budapest");

        InnerJoin.join(hashMap, hashMap2);

        hashMap.forEach((k, v) -> System.out.println(k + " " + v));
    }

}


class Entry {
    Integer number;
    List<String> list;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(number, entry.number) && Objects.equals(list, entry.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, list);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "number=" + number +
                ", list=" + list +
                '}';
    }
}