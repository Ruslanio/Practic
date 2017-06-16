package bilet12;

/**
 * Created by Ruslan on 10.06.2017.
 */

public class RationalFrac {

    private int numerator;
    private int denominator;
    private int intPart;

    public RationalFrac() {
        numerator = 1;
        denominator = 2;
        intPart = 0;
    }

    public RationalFrac(int numerator, int denominator, int intPart) throws RationalFracException {
        if (intPart != 0 && numerator >= denominator){
            throw new RationalFracException();
        }
        if (intPart < 0){
            throw new RationalFracException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
        this.intPart = intPart;
    }

    public void toProperFrac() throws RationalFracException {
        if (numerator < denominator) {
            throw new RationalFracException();
        }
        if (intPart != 0 ){
            throw new RationalFracException();
        }
        intPart = numerator / denominator;
        numerator = numerator % denominator;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void summ(RationalFrac frac) {
        frac.toRationalFrac();
        this.toRationalFrac();
        if (this.denominator == frac.getDenominator()) {
            this.numerator = this.numerator + frac.getNumerator();
        } else {
            int generalDenominator = this.denominator * frac.getDenominator();
            this.denominator = generalDenominator;
            this.numerator = this.numerator * frac.getDenominator() + frac.getNumerator() * this.denominator;
        }
    }

    public void mult(RationalFrac frac){
        frac.toRationalFrac();
        this.toRationalFrac();
        this.numerator = this.numerator * frac.getNumerator();
        this.denominator = this.denominator * frac.getDenominator();
    }

    public void toRationalFrac(){
        if (intPart == 0){
            //do nothing
        } else {
            numerator = numerator + denominator * intPart;
        }
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setIntPart(int intPart) {
        this.intPart = intPart;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getIntPart() {
        return intPart;
    }
}
