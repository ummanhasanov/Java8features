package org.example;

import java.util.Arrays;
import java.util.List;

public class MainStreamWhyNeededOptional {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("word1", "word2", "word3", "word4");

        String result = words.stream()
                .filter(s -> s.equalsIgnoreCase("word5"))
                .findAny()
//                .orElse("not found");
                .orElseThrow(()-> new IllegalArgumentException("invalid key")); // for exception
        System.out.println(result);

    }
}