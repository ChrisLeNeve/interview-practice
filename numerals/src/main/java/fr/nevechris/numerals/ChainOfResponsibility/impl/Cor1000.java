package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor1000 extends NumberChainOfResponsibility {
    public Cor1000() {
        super();
        this.decimalValue = 1000;
        this.romanNumeralValue = "M";
        this.next = new Cor900();
    }
}
