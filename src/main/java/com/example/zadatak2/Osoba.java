package com.example.zadatak2;
import java.lang.String;
import java.lang.Object;
public class Osoba {
    private String ime, prezime;
    public Osoba(String i, String p) {
        ime = i; prezime = p;
    }
    public String toString() {
        return ime + ' ' + prezime;
    }
}