package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        for(int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("Adding " + i);
                sum += i;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
