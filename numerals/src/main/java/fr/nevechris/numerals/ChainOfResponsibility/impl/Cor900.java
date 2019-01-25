package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor900 extends NumberChainOfResponsibility {
    public Cor900() {
        super();
        this.decimalValue = 900;
        this.romanNumeralValue = "CM";
        this.next = new Cor500();
    }
}
