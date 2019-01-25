package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor400 extends NumberChainOfResponsibility {
    public Cor400() {
        super();
        this.decimalValue = 400;
        this.romanNumeralValue = "CD";
        this.next = new Cor100();
    }
}
