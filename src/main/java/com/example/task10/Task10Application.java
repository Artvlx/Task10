package com.example.task10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Map;

@SpringBootApplication
public class Task10Application {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(Task10Application.class, args);

		Task1 task1 = new Task1();
		task1.printValidPhoneNumbers("fileNumbers.txt");

		Task2 task2 = new Task2();
		task2.convertFileToJson("fileNames.txt", "user.json");

		Task3 task3 = new Task3();
		Map<String, Integer> frequency = task3.countWordFrequency("words.txt");
		task3.printWordFrequency(frequency);
	}
}
