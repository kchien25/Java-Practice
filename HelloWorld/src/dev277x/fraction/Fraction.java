public class Fraction {
    private int numerator;
    private int denominator;

    public void setFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0.");
        } else if (((numerator > 0) && (denominator > 0)) || ((numerator < 0) && (denominator > 0))) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            this.numerator = numerator * -1;
            this.denominator = denominator * -1;
        }
    }

    public void setFraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public void setFraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Double toDouble() {
        return (numerator / denominator);
    }

    public Fraction add(Fraction other) {
        this.numerator += other.numerator;
        this.denominator += other.denominator;
        return this;
    }


}