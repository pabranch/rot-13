package com.example;

public class RotN {

    private final int delta;

    public RotN() {
        this(13);
    }

    public RotN(int delta) {
        this.delta = delta;
    }

    public String encode(String s) {
        if (s == null) return "";

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'a' && c <= 'z') {
                chars[i] = lowerChars[(c - 'a' + delta) % 26];
            }
            else if (c >= 'A' && c <= 'Z') {
                chars[i] = upperChars[(c - 'A' + delta) % 26];
            }
        }
        return String.valueOf(chars);
    }

    private static char[] lowerChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static char[] upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
}
