package ru.netology.sqr;

public class SQRServicebm {
    public int calculate(int lowValue, int upValue) {
        int i = 0;
        for (int numer = 10; numer <= 99; numer = numer + 1) {
            if (Math.pow(numer, 2) >= lowValue && Math.pow(numer, 2) <= upValue) {
                i = i + 1;
            }
        }
        return i;
    }
}