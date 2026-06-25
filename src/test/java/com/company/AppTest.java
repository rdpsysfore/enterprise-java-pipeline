package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAdd() {

        assertEquals(
                30,
                App.add(10,20)
        );
    }
}
