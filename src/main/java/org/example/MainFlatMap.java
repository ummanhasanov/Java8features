package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFlatMap {
    public static void main(String[] args) {

        List<List<String>> words = Arrays.asList(
                Arrays.asList("1-word1", "1-word2", "1-word3", "1-word4"),
                Arrays.asList("2-word1", "2-word2", "2-word3", "2-word4"),
                Arrays.asList("3-word1", "3-word2", "3-word3", "3-word4")
        );

        // without flatmap it will return list of list [[7, 7, 7, 7], [7, 7, 7, 7], [7, 7, 7, 7]]
        // words of stream are stream of lists
        List<List<Integer>> l = words.stream()
                // mapping each of list we create new stream of lists and do it mapping to length and return it Stream of Stream Integer
                .map(list -> list.stream().map(String::length))
                // each time recieved stream  we collect to list  it returns Stream of list
                .map(stream -> stream.collect(Collectors.toList()))
                // then collect all list to list and return it List of List Integer
                .collect(Collectors.toList());
        System.out.println(l);

        System.out.println("---------------------------------------------");
        // with flatmap it will return list [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
        List<Integer> l1 = words.stream().flatMap(
                list -> list.stream().map(String::length)
        ).collect(Collectors.toList());
        System.out.println(l1);


    }
}