public class Fractions {
    private long wholePart;
    private short fractionalPart;

    public Fractions(long wholePart, short fractionalPart) {
        if (fractionalPart == 0) {
            System.err.println("The fractionalPart can't be negative!");
        } else {
            this.wholePart = wholePart;
            this.fractionalPart = fractionalPart;
        }
    }


    public Fractions addition(Fractions secondFractions) {
        if (this.fractionalPart == secondFractions.fractionalPart) {
            return new Fractions(this.wholePart + secondFractions.wholePart, this.fractionalPart);
        } else {
            return new Fractions(this.wholePart * secondFractions.fractionalPart + secondFractions.wholePart * this.fractionalPart,
                    (short) (this.fractionalPart * secondFractions.fractionalPart));

        }
    }

    public Fractions subtraction(Fractions secondFractions) {
        if (this.fractionalPart == secondFractions.fractionalPart) {
            return new Fractions(this.wholePart - secondFractions.wholePart, this.fractionalPart);
        } else {
            return new Fractions(this.wholePart * secondFractions.fractionalPart - secondFractions.wholePart * this.fractionalPart,
                    (short) (this.fractionalPart * secondFractions.fractionalPart));

        }
    }

    public Fractions multiplication(Fractions secondFractions) {
        return new Fractions(this.wholePart * secondFractions.wholePart,
                (short) (this.fractionalPart * secondFractions.fractionalPart));
    }

    public Fractions division(Fractions secondFractions) {
        return new Fractions(this.wholePart * secondFractions.fractionalPart,
                (short) (this.fractionalPart * secondFractions.wholePart));
    }

    @Override
    public String toString() {
        return wholePart + "/" + fractionalPart;
    }
}
