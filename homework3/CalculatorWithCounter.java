package homework3;

public class CalculatorWithCounter {

    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathCopy calc2;
    private final CalculatorWithMathExtends calc3;
    private long counter = 0;

    public CalculatorWithCounter (CalculatorWithOperator calc) {
        this.calc1 = calc;
        this.calc2 = null;
        this.calc3 = null;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calc) {
        this.calc1 = null;
        this.calc2 = calc;
        this.calc3 = null;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calc) {
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = calc;
    }

    public double sum(double a, double b) {
        this.counter++;
        if (this.calc1 != null) {
            return this.calc1.sum(a, b);
        } else if (this.calc2 != null) {
            return this.calc2.sum(a, b);
        } else {
            return this.calc3.sum(a, b);
        }
    }

    public double minus(double a, double b) {
        this.counter++;
        if (this.calc1 != null) {
            return this.calc1.minus(a, b);
        } else if (this.calc2 != null) {
            return this.calc2.minus(a, b);
        } else {
            return this.calc3.minus(a, b);
        }
    }

    public double multy(double a, double b) {
        this.counter++;
        if (this.calc1 != null) {
            return this.calc1.multy(a, b);
        } else if (this.calc2 != null) {
            return this.calc2.multy(a, b);
        } else {
            return this.calc3.multy(a, b);
        }
    }

    public double diagonal(double a, double b) {
        this.counter++;
        if (this.calc1 != null) {
            return this.calc1.diagonal(a, b);
        } else if (this.calc2 != null) {
            return this.calc2.diagonal(a, b);
        } else {
            return this.calc3.diagonal(a, b);
        }
    }

    public double pow(double value, int powValue) {
        this.counter++;
        if (this.calc1 != null) {
            return this.calc1.pow(value, powValue);
        } else if (this.calc2 != null) {
            return this.calc2.pow(value, powValue);
        } else {
            return this.calc3.pow(value, powValue);
        }
    }

    public double mod(double a) {
        this.counter++;
        if (this.calc1 != null) {
            return this.calc1.mod(a);
        } else if (this.calc2 != null) {
            return this.calc2.mod(a);
        } else {
            return this.calc3.mod(a);
        }
    }

    public double sqr(double a) {
        this.counter++;
        if (this.calc1 != null) {
            return this.calc1.sqr(a);
        } else if (this.calc2 != null) {
            return this.calc2.sqr(a);
        } else {
            return this.calc3.sqr(a);
        }
    }
}
