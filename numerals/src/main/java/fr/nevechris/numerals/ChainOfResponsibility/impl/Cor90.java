package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor90 extends NumberChainOfResponsibility {
    public Cor90() {
        super();
        this.decimalValue = 90;
        this.romanNumeralValue = "XC";
        this.next = new Cor50();
    }
}
