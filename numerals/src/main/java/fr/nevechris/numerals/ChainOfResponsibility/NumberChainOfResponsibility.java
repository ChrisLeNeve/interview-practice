package fr.nevechris.numerals.ChainOfResponsibility;

public abstract class NumberChainOfResponsibility {
    protected NumberChainOfResponsibility next;
    protected int decimalValue;
    protected String romanNumeralValue;

    public NumberChainOfResponsibility() {
    }

    public String convert(int decimal) {
        int remainder = decimal;
        StringBuilder numerals = new StringBuilder();
        while (remainder != 0) {
            if (remainder >= this.decimalValue) {
                numerals.append(this.romanNumeralValue);
                remainder -= this.decimalValue;
            } else {
                numerals.append(next.convert(remainder));
                break;
            }
        }

        return numerals.toString();
    }

    /**
     * In roman numerals:
     * I can be subtracted from V, X
     * X from L, C
     * C from D and M.
     * In other words: only I, X, C can be subtracted, and only from the next two values.
     * @return true if current numeral can be subtracted from the next.
     */
    private boolean isSubtractableFromCurrent() {
        if (next == null) return false;
        return ((next.decimalValue * 5 == this.decimalValue) || (next.decimalValue * 10 == this.decimalValue));
    }

    private void subtractWhenPresent(String nextSection) {
        StringBuilder sequenceOfFour = new StringBuilder();
        String newSequence = next.romanNumeralValue + this.romanNumeralValue;
        for (int i = 0; i < 3; i++)
            sequenceOfFour.append(next.romanNumeralValue);
        nextSection.replace(sequenceOfFour.toString(), newSequence);
    }
}
