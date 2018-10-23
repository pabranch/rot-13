package com.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        String originalString = Stream.of(args).collect(Collectors.joining(" "));

        RotN rotator = new RotN();
        System.out.println(rotator.encode(originalString));
    }

}
