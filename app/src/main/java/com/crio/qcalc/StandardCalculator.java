package com.crio.qcalc;

public class StandardCalculator {
    private int result;

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void clearResult() {
        result = 0;
        setResult(result);
    }

    public void printResult() {
        System.out.println(getResult());
    }

    public int add(int num1, int num2) {
        result = num1 + num2;
        setResult(result);
        return result;
    }

    public void subtract(int num1, int num2) {
        result = num1 - num2;
        setResult(result);
    }

    public void multiply(int num1, int num2) {
        result = num1 * num2;
        setResult(result);
    }

    public void divide(int num1, int num2) {
        if (num2 != 0) {
            result = num1 / num2;
            setResult(result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
