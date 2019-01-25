package fr.nevechris.numerals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConverterTest {

    private Converter converter;

    @Before
    public void setUp() {
        this.converter = new Converter();
    }

    @Test
    public void assertConversionWorks() {
        Assert.assertEquals("MMMMCMXCIX", converter.convertThisIntToRomanNumerals(4999));
        Assert.assertEquals("CMXCIX", converter.convertThisIntToRomanNumerals(999));
        Assert.assertEquals("CMLXXXIX", converter.convertThisIntToRomanNumerals(989));
        Assert.assertEquals("DCXXVI", converter.convertThisIntToRomanNumerals(626));
        Assert.assertEquals("DCXXIV", converter.convertThisIntToRomanNumerals(624));
        Assert.assertEquals("CDXCVIII", converter.convertThisIntToRomanNumerals(498));
        Assert.assertEquals("CXXIII", converter.convertThisIntToRomanNumerals(123));
        Assert.assertEquals("XCIX", converter.convertThisIntToRomanNumerals(99));
        Assert.assertEquals("LI", converter.convertThisIntToRomanNumerals(51));
        Assert.assertEquals("XLIX", converter.convertThisIntToRomanNumerals(49));
    }

    @Test
    public void failIfNumberTooBig() {
        Assert.assertEquals("Value is too big!", converter.convertThisIntToRomanNumerals(5000));
    }

    @Test
    public void failIfNumberToooSmall() {
        Assert.assertEquals("Value is too small!", converter.convertThisIntToRomanNumerals(0));
        Assert.assertEquals("Value is too small!", converter.convertThisIntToRomanNumerals(-1));
    }

}
