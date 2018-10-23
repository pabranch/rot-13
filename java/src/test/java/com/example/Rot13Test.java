package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Rot13Test {

    String allAlpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Test
    public void encode_withNull_returnsEmptyString() {
        Rot13 r = new Rot13();
        assertEquals("", r.encode(null));
    }

    @Test
    public void encode_withEmptyString_returnsEmptyString() {
        Rot13 r = new Rot13();
        assertEquals("", r.encode(""));
    }

    @Test
    public void encode_withOnlySpaces_returnsOriginal() {
        Rot13 r = new Rot13();
        assertEquals("  ", r.encode("  "));
    }

    @Test
    public void encode_withNoLetters_returnsOriginal() {
        Rot13 r = new Rot13();
        assertEquals("1 2 #", r.encode("1 2 #"));
    }

    @Test
    public void encode_withSomeLetters_onlyChangesLetters() {
        Rot13 r = new Rot13();
        assertEquals("1 2 tang#GNAT", r.encode("1 2 gnat#TANG"));
    }

    @Test
    public void encode_appliedTwice_returnsOriginal() {
        Rot13 r = new Rot13();
        assertEquals(allAlpha, r.encode(r.encode(allAlpha)));
    }

    @Test
    public void encode_withEveryLetter_changesAll() {
        Rot13 r = new Rot13();
        assertEquals(
                "nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZABCDEFGHIJKLM",
                r.encode(allAlpha));
    }
}
