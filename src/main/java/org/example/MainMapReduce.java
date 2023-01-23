package org.example;

import java.util.Arrays;
import java.util.List;

public class MainMapReduce {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("word1", "word2", "word3", "word4");

        // stream allows to send big data to RAM
        int result = words.stream()
                .map(String::length)
                .reduce(0, Integer::sum);// we can use (a,b)->a+b instead   of Integer::sum

        System.out.println(result);
    }
}