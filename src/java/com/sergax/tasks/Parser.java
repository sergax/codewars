package com.sergax.tasks;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: sergax
 * @date: 30.07.22
 */
public class Parser {
    private final String path = "/home/serhii/Documents/my_folder/inteleJ_projects/leetcode/file.txt";
    private boolean exit = false;

    private Map<Integer, List<String>> readFromFile() throws Exception {
        Map<Integer, List<String>> list = new HashMap<>();
        List<String> fullName = new ArrayList<>();
        String name;
        String line;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while ((line = reader.readLine()) != null) {
            if (line.equals("quit")) break;
            System.out.println("Type your full name by space: ");
            System.out.println("firstname_lastname: ");
            name = reader.readLine();
            System.out.println("Type your age: ");
            int age = Integer.parseInt(reader.readLine());
            fullName.add(name);
            list.put(age, fullName);
        }
        return list;
    }

    public void writeContent(Map<Integer, List<String>> list) throws Exception {
        try (FileWriter fileWriter = new FileWriter(path)) {
           fileWriter.write(Map.of(list.keySet(), list.values()).toString());
        }
    }

    public static void main(String... args) throws Exception {
        Parser parser = new Parser();
        Map<Integer, List<String>> list = parser.readFromFile();
        parser.writeContent(list);
    }
}
