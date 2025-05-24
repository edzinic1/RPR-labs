package com.example.vjzezba2z2;

import java.lang.System;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = unos.nextInt();
        System.out.println("Sinus broja je: "+ Math.sin(n));
        int m = 1;
        for(int i = 1; i <= n; i++) m *= i;
        System.out.println("Faktorijel broja je: " + m);
    }
}