package com.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.fail;

public class AppTest {

    @Test
    public void rotate_withNoArguments_returnsSame() {
        String[] args = new String[0];
        App.main(args);
    }
}
