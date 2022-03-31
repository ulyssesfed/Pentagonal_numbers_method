package com.company;

public class Main {

    public static void main(String[] args) {
        pentagonalNumbers(); 
    }
    public static void pentagonalNumbers() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i * (3 * i - 1) / 2); //pentagonal numbers
        }
    }
}
