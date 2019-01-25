package fr.nevechris.numerals.ChainOfResponsibility.impl;

import fr.nevechris.numerals.ChainOfResponsibility.NumberChainOfResponsibility;

public class Cor9 extends NumberChainOfResponsibility {
    public Cor9() {
        super();
        this.decimalValue = 9;
        this.romanNumeralValue = "IX";
        this.next = new Cor5();
    }
}
