package com.sergax.tasks;

import java.util.*;

/**
 * @author: sergax
 * @date: 29.07.22
 */
public final class Test2 {
    final long id;
    final String date;
    final int mark;

    public Test2(long id, String date, int mark) {
        this.id = id;
        this.date = date;
        this.mark = mark;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test2 test2 = (Test2) o;
        return id == test2.id && date.equals(test2.date) && mark == test2.mark;
    }

    public int hashCode() {
        return Objects.hash(id, date, mark);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", date='" + date + '\'' +
                ", mark=" + mark;
    }

    public static void main(String... piu) {
        Set<Test2> map1 = new HashSet<>();

        Test2 test2 = new Test2(1, "02.02.1665", 10);
        Test2 test3 = new Test2(1, "02.02.1665", 10);
        Test2 test4 = new Test2(1, "02.02.1665", 10);

        map1.add(null);
        map1.add(test2);
        map1.add(test3);
        map1.add(test4);

        map1.forEach((k) -> {
            System.out.println("Key: " + k);
//            System.out.println("Value: " + v);
        });
    }
}
