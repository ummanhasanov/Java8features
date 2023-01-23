package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainMaps {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("word1", "word2", "word3", "word4");

        List<String> upperWords = words.stream()
                .map(String::toUpperCase)// here we can add any methods and get new methods
                .collect(Collectors.toList());

        words.stream()
                .filter((word) -> word.equalsIgnoreCase("word1"))
                .findFirst()// or findAny()
                .ifPresent(MainMaps::foo);

    }

    private static void foo(String s) {
        System.out.println(s);
    }

    private static Optional<String> find(List<String> words, String s) {
        // stream() created new stream from word and created filter in stream
        return words.stream().filter((word) -> word.equalsIgnoreCase(s)).findFirst();
    }
}