package com.example;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        String originalString = Stream.of(args).collect(Collectors.joining(" "));

        System.out.println("character math:\t" + encode(originalString, c -> {
            if ((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M')) {
                return (char) (c + 13);
            }
            else if ((c >= 'n' && c <= 'z') || (c >= 'N' && c <= 'Z')) {
                return (char) (c - 13);
            }
            return c;
        }));
    }

    private static String encode(String s, Function<Character, Character> rotator) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = rotator.apply(chars[i]);
        }
        return String.valueOf(chars);
    }
}
