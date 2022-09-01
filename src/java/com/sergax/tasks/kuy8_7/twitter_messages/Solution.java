package com.sergax.tasks.kuy8_7.twitter_messages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : sergax
 * @date : 15.07.22
 * <p>
 * Return unique tags, which sorted.
 */
public class Solution {
    static List<String> getHashTags(List<String> twits) {
        return Arrays.stream(Arrays.toString(twits.stream().toArray()).split(" "))
                .filter(w -> w.startsWith("#"))
                .map(word -> word.substring(1))
                .distinct()
                .sorted(Comparator.comparing(String::toString).reversed())
                .toList();
    }

    public static void main(String[] args) {
        List<String> twits = new ArrayList<>();
        twits.add("#Java and #Scala are thr langueges of congnitive. 18M sees. #Java");
        twits.add("#Java and  are thr langueges of congnitive. 18M sees.");
        twits.add("#Java and #Scala are thr langueges of congnitive. 18M sees.");

        System.out.println(Solution.getHashTags(twits));
    }
}
