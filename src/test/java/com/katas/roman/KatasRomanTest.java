package com.katas.roman;

import org.junit.Assert;
import org.junit.Test;

public class KatasRomanTest {

    @Test
    public void convert_roman_should_return_numeral(){
        assertRoman( "i", 1);
        assertRoman( "ii", 2);
    }

    private void assertRoman(String roman, int numeral) {
        Assert.assertEquals(String.valueOf(numeral), KatasRoman.romanToNumeral(roman));
    }
}
