package com.lawlett.unittest;

public class Math {

    public String plus(String a, String b) {
        if (a.isEmpty() || b.isEmpty()){
            return "empty";
        }
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return String.valueOf(num1 + num2);
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
