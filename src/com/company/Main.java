package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int NUM = 1000;
        boolean flagJust = false;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");

        long age = in.nextLong();



        if (age % 2 == 0) {
            System.out.println("Число " + age + " является четным");
        } else {
            System.out.println("Число " + age + " является нечетным");
        }

        for ( int i = 2; i < NUM; i++) {

            if ( age % i == 0) {
                System.out.println("Число составное");
                flagJust = true;
                return;
            }
        }

        if (!flagJust) {
            System.out.println("Число простое");
            flagJust = false;
        }
    }
}
