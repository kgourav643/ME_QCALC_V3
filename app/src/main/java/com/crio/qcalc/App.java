package com.crio.qcalc;

public class App {
    static StandardCalculator calc = new StandardCalculator();

    public static void main(String[] args) {
        int result = calc.add(1, 1);
        System.out.println(result);
    }
}
