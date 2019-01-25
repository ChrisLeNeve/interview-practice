package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor10 extends NumberChainOfResponsibility {
    public Cor10() {
        super();
        this.decimalValue = 10;
        this.romanNumeralValue = "X";
        this.next = new Cor9();
    }
}
