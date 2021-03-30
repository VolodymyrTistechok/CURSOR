public class Money {
    private long hryvnia;
    private byte kopeck;
    private double resultHryvnia;

    public Money(long hryvnia, byte kopeck) {
        this.hryvnia = hryvnia;
        if (kopeck > 0 && kopeck < 100) {
            this.kopeck = kopeck;
        } else {
            System.out.println("enter a value between 1 and 99");
        }
        this.resultHryvnia = (double) ((this.hryvnia * 100) + this.kopeck) / 100;
    }

    public Money addition(Money secondMoney) {
        return doubleToMoney(this.resultHryvnia + secondMoney.resultHryvnia);
    }

    public Money subtraction(Money secondMoney) {
        return doubleToMoney(this.resultHryvnia - secondMoney.resultHryvnia);
    }

    public Money multiplicationMoney(Money secondMoney) {
        return doubleToMoney(this.resultHryvnia * secondMoney.resultHryvnia);
    }

    public Money divisionMoney(Money secondMoney) {
        return doubleToMoney(this.resultHryvnia / secondMoney.resultHryvnia);
    }

    public Money multiplication(double val) {
        return doubleToMoney(this.resultHryvnia * val);
    }

    public Money division(double val) {
        return doubleToMoney(this.resultHryvnia / val);
    }

    private Money doubleToMoney(double value) {
        return new Money((long) (value), (byte) (Math.abs(value - (long) (value)) * 100));
    }

/*    public boolean more(Money secondMoney) {
        return this.resultHryvnia > secondMoney.resultHryvnia;
    }

    public boolean equal(Money secondMoney) {
        return this.resultHryvnia == secondMoney.resultHryvnia;
    }
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money secondMoney = (Money) o;
        if (this.resultHryvnia == secondMoney.resultHryvnia) {
            System.out.print("true ");
            System.out.println(this.toString() + " = " + secondMoney.toString());
            return true;
        } else if (this.resultHryvnia > secondMoney.resultHryvnia) {
            System.out.print("false ");
            System.out.println(this.toString() + " > " + secondMoney.toString());
            return false;
        } else {
            System.out.print("false ");
            System.out.println(this.toString() + " < " + secondMoney.toString());
            return false;
        }
    }

    @Override
    public String toString() {
        return hryvnia + ", " + kopeck;
    }
}
