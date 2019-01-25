package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor40 extends NumberChainOfResponsibility {
    public Cor40() {
        super();
        this.decimalValue = 40;
        this.romanNumeralValue = "XL";
        this.next = new Cor10();
    }
}
