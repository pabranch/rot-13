package com.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        String originalString = Stream.of(args).collect(Collectors.joining(" "));

        String deltaConfig = System.getenv("ROT");
        int delta = deltaConfig != null ? Integer.valueOf(deltaConfig) : 13;
        RotN rotator = new RotN(delta);

        System.out.println(rotator.encode(originalString));
    }

}
