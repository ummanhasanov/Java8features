package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("word1", "word2", "word3", "word4");

        words.stream()
                .map((s)-> s + " word")
                .forEach(System.out::println);// system out reference println

    }
}