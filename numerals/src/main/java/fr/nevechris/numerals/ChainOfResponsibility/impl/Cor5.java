package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor5 extends NumberChainOfResponsibility {
    public Cor5() {
        super();
        this.decimalValue = 5;
        this.romanNumeralValue = "V";
        this.next = new Cor4();
    }
}
