package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor1 extends NumberChainOfResponsibility {
    public Cor1() {
        super();
        this.decimalValue = 1;
        this.romanNumeralValue = "I";
        this.next = null;
    }
}
