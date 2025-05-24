package com.example.zadatak2;
import com.example.zadatak2.Osoba;
import com.example.zadatak2.Racun;
import java.lang.String;
public class Korisnik extends Osoba {
    private Racun r;
    public Korisnik(String i, String p){
        super(i, p);
    }
    public void dodajRacun(Racun rac){
        r = rac;
    }
    public Racun racun(){
        return r;
    }
}
