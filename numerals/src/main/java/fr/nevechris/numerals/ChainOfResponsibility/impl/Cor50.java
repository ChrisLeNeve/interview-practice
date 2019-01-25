package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor50 extends NumberChainOfResponsibility {
    public Cor50() {
        super();
        this.decimalValue = 50;
        this.romanNumeralValue = "L";
        this.next = new Cor40();
    }
}
