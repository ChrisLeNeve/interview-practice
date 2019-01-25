package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor500 extends NumberChainOfResponsibility {
    public Cor500() {
        super();
        this.decimalValue = 500;
        this.romanNumeralValue = "D";
        this.next = new Cor400();
    }
}
