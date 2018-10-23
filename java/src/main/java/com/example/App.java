package com.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        String originalString = Stream.of(args).collect(Collectors.joining(" "));

        Rot13 rotator = new Rot13();
        System.out.println(rotator.encode(originalString));
    }

}
