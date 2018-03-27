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

    public double toDouble() {
        double numerator2 = numerator;
        double denominator2 = denominator;
        return (numerator2 / denominator2);
    }

    // please don't make fun of me if i did this wrong. it's my first time :'( 3/12/18
    public Fraction add(Fraction other) {
        // make the same denominator
        int equalify = other.denominator;
        other.numerator *= this.denominator;
        other.denominator *= this.denominator;
        this.numerator *= equalify;
        this.denominator *= equalify;
        this.numerator += other.numerator;

        // reduce the fraction
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        return this;
    }

    public Fraction subtract(Fraction other) {
        int equalify = other.denominator;
        other.numerator *= this.denominator;
        other.denominator *= this.denominator;
        this.numerator *= equalify;
        this.denominator *= equalify;
        this.numerator -= other.numerator;

        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;

        // if denominator is negative then switching the negative to the top
        if (this.denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
        return this;
    }

    public Fraction multiply(Fraction other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        return this;
    }

    public Fraction divide(Fraction other) {
        if (other.numerator != 0) {
            this.numerator *= other.denominator;
            this.denominator *= other.numerator;
        } else {
            System.out.print("Cannot divide by 0. Fraction is unchanged: ");
        }
        return this;
    }

    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction fraction = (Fraction)other;
            return this.equalsTest(fraction);
        } else {
            return false;
        }
    }
    
    // i know this is ugly but i'm a beginner and self-taught :( don't make me cry just yet
    public boolean equalsTest(Fraction other) {
        if (((this.numerator != 0) && (other.numerator != 0)) || ((this.numerator == 0) && (other.numerator == 0))) {
            if (((other.numerator % this.numerator == 0) || (this.numerator % other.numerator == 0)) && ((other.denominator % this.denominator == 0) || (this.denominator % other.denominator == 0))){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int gcd(int a, int b) {
        while ((a != 0) && (b != 0)) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public void toLowestTerms(int numerator, int denominator) {
        this.numerator = (numerator / gcd(numerator, denominator));
        this.denominator = (denominator / gcd(numerator, denominator));
        System.out.println(numerator + "/" + denominator);
    }

}