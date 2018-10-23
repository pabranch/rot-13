package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.Buffer;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AppTest {

    private PrintStream stdout;
    private ByteArrayOutputStream outBuffer;
    private PrintStream stderr;
    private ByteArrayOutputStream errBuffer;

    @Before
    public void stubOutput() {
        stdout = System.out;
        outBuffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outBuffer));

        stderr = System.err;
        errBuffer = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errBuffer));
    }

    @After
    public void restoreOutput() {
        System.setOut(stdout);
        System.setErr(stderr);
    }

    @Test
    public void main_withNoArguments_works() {
        String[] args = new String[0];
        App.main(args);
        assertEquals("", errBuffer.toString());
        assertEquals("\n", outBuffer.toString());
    }

    @Test
    public void main_withSingleArgument_works() {
        String[] args = new String[]{"1 2 taNG gnAT"};
        App.main(args);
        assertEquals("", errBuffer.toString());
        assertEquals("1 2 gnAT taNG\n", outBuffer.toString());
    }

    @Test
    public void main_withMultipleArguments_works() {
        String[] args = new String[]{"1 2 taNG", "gnAT"};
        App.main(args);
        assertEquals("", errBuffer.toString());
        assertEquals("1 2 gnAT taNG\n", outBuffer.toString());
    }
}
