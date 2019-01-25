package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor4 extends NumberChainOfResponsibility {
    public Cor4() {
        super();
        this.decimalValue = 4;
        this.romanNumeralValue = "IV";
        this.next = new Cor1();
    }
}
