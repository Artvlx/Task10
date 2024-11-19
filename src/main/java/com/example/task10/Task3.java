package com.example.task10;

import java.io.*;
import java.util.*;
public class Task3 {
    public Map<String, Integer> countWordFrequency(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Map<String, Integer> wordFrequency = new HashMap<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }
            return wordFrequency;
        }
    }
    public void printWordFrequency(Map<String, Integer> wordFrequency) {
        wordFrequency.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}