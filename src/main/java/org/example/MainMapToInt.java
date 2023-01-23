package org.example;

import java.util.Arrays;
import java.util.List;

public class MainMapToInt {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("word1", "word2", "word3", "word4");

        int result = words.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println(result);

    }
}