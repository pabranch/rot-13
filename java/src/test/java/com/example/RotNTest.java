package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotNTest {

    String allAlpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Test
    public void encode_withNull_returnsEmptyString() {
        RotN r = new RotN();
        assertEquals("", r.encode(null));
    }

    @Test
    public void encode_withEmptyString_returnsEmptyString() {
        RotN r = new RotN();
        assertEquals("", r.encode(""));
    }

    @Test
    public void encode_withOnlySpaces_returnsOriginal() {
        RotN r = new RotN();
        assertEquals("  ", r.encode("  "));
    }

    @Test
    public void encode_withNoLetters_returnsOriginal() {
        RotN r = new RotN();
        assertEquals("1 2 #", r.encode("1 2 #"));
    }

    @Test
    public void encode_withSomeLetters_onlyChangesLetters() {
        RotN r = new RotN();
        assertEquals("1 2 tang#GNAT", r.encode("1 2 gnat#TANG"));
    }

    @Test
    public void encode_defaultAppliedTwice_returnsOriginal() {
        RotN r = new RotN();
        assertEquals(allAlpha, r.encode(r.encode(allAlpha)));
    }

    @Test
    public void encode_withEveryLetter_changesAll() {
        RotN r = new RotN();
        assertEquals(
                "nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZABCDEFGHIJKLM",
                r.encode(allAlpha));
    }

    @Test
    public void encode_withDelta26_returnsOriginal() {
        RotN r = new RotN(26);
        assertEquals(allAlpha, r.encode(allAlpha));
    }

    @Test
    public void encode_withSmallerDelta_works() {
        RotN r = new RotN(5);
        assertEquals(
                "fghijklmnopqrstuvwxyzabcdeFGHIJKLMNOPQRSTUVWXYZABCDE",
                r.encode(allAlpha));
    }

    @Test
    public void encode_withLargerDelta_works() {
        RotN r = new RotN(15);
        assertEquals(
                "pqrstuvwxyzabcdefghijklmnoPQRSTUVWXYZABCDEFGHIJKLMNO",
                r.encode(allAlpha));
    }

    @Test
    public void encode_withDeltaOver26_works() {
        RotN r = new RotN(256);
        assertEquals(
                "wxyzabcdefghijklmnopqrstuvWXYZABCDEFGHIJKLMNOPQRSTUV",
                r.encode(allAlpha));
    }
}
