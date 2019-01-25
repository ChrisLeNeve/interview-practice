package fr.nevechris.numerals;

import fr.nevechris.numerals.ChainOfResponsibility.impl.Cor1000;

public class Converter {
    private static int MAX_VALUE = 5000;
    private static int MIN_VALUE = 0;
    private static String ERROR_TOO_BIG = "Value is too big!";
    private static String ERROR_TOO_SMALL = "Value is too small!";

    public String convertThisIntToRomanNumerals(int decimal) {
        Cor1000 startingCor = new Cor1000();
        if (decimal >= MAX_VALUE)
            return ERROR_TOO_BIG;
        if (decimal <= MIN_VALUE)
            return ERROR_TOO_SMALL;

        String numeralsWithoutConversion = startingCor.convert(decimal);
        return numeralsWithoutConversion;
//        return convert(numeralsWithoutConversion);
    }

    private String convert(String numerals) {
        String converted = numerals.replace("DCCCC", "CM")
                .replace("CCCC", "CD")
                .replace("LXXXX", "XC")
                .replace("XXXX", "XL")
                .replace("VIIII", "IX")
                .replace("IIII", "IV");
        return converted;
    }
}
