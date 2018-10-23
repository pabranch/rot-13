package com.example;

public class RotN {

    public String encode(String s) {
        if (s == null) return "";

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M')) {
                chars[i] = (char)(c + 13);
            }
            else if ((c >= 'n' && c <= 'z') || (c >= 'N' && c <= 'Z')) {
                chars[i] = (char)(c - 13);
            }
        }
        return String.valueOf(chars);
    }
}
