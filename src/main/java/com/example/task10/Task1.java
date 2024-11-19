package com.example.task10;

import java.io.*;
import java.util.regex.*;
public class Task1 {
    public void printValidPhoneNumbers(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            String regex1 = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
            String regex2 = "^\\d{3}-\\d{3}-\\d{4}$";
            while ((line = reader.readLine()) != null) {
                boolean matchesPattern1 = line.matches(regex1);
                boolean matchesPattern2 = line.matches(regex2);
                if (matchesPattern1 || matchesPattern2) {
                    System.out.println(line);
                }
            }
        }
    }
}