package com.xyz;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testGetToday() {
        String actual = App.getToday();
        String expected = new SimpleDateFormat("dd-mm-yyyy").format(new Date());
        assertEquals(expected, actual);
    }
}