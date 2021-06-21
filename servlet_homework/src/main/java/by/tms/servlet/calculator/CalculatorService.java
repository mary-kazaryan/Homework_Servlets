package by.tms.servlet.calculator;

public class CalculatorService {

    public double calculate (double a, double b, String operation ) {
        switch (operation) {
            case "sum": {
                return sum(a, b);}
            case "deduct": {
                return deduct(a, b);}
            case "multiply": {
                return multiply(a, b);}
            case "divide": {
                return divide(a, b);}
            }
        return 0;
    }

    private double sum (double a, double b) {
        return a + b;
    }

    private double deduct (double a, double b) {
        return a - b;
    }

    private double multiply (double a, double b) {
        return  a * b;
    }

    private double divide (double a, double b) {
        return a / b;
    }
}
