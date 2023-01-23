package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("word1", "word2", "word3", "word4");

       // the code below is equivalent to the code above
        Stream.of("word1", "word2", "word3", "word4")
                .filter((word) -> word.equalsIgnoreCase("word1"))
                .findFirst()
                .ifPresent(Main::foo);

        System.out.println("--------------------------------");

        //it is a Lambda this is implemented from functional interface Consumer
        words.forEach((s) -> System.out.println(s));

        System.out.println("--------------------------------");

        // old type of for each code
        for (String s : words) {
            System.out.println(s);
        }

        System.out.println("--------------------------------");

        // it is a method reference
        // the code below don't called the below method now, it will call later. We just call the method named
        words.forEach(System.out::println);

        System.out.println("it is an Optional");// we can call with Optional method
        //  it is an Optional => it is called functional programming we can call with Optional method
        find(words, "word1").ifPresent(System.out::println);

        System.out.println("your own method with Optional");// we can call with Optional method
        // use your own method with Optional we can call with Optional method
        find(words, "word2").ifPresent(Main::foo);

    }

    private static void foo(String s) {
        System.out.println(s);
    }

    private static Optional<String> find(List<String> words, String s) {
        // stream() created new stream from word and created filter in stream
        return words.stream().filter((word) -> word.equalsIgnoreCase(s)).findFirst();
    }
}