package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor100 extends NumberChainOfResponsibility {
    public Cor100() {
        super();
        this.decimalValue = 100;
        this.romanNumeralValue = "C";
        this.next = new Cor90();
    }
}
