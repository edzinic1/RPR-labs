package com.example.zadatak2;
import com.example.zadatak2.Osoba;
public class Racun {
    private long broj = 0;
    private double uplata = 0;
    private Osoba korisnik;
    private boolean prekoracenje = false;
    public Racun(long b, Osoba k){
        broj = b; korisnik = k;
    }
    public boolean ProvjeriteOdobravanjePrekoracenja(double x){
        if(prekoracenje) return true;
        if(uplata - x < 0) return false;
        return true;
    }
    public boolean izvrsiUplatu(double u){
        uplata += u; return true;
    }
    public boolean izvrsiIsplatu(double i){
        if(uplata - i < 0) return false;
        uplata -= i; return true;
    }
    public void odobriPrekoracenje(){prekoracenje = true;}
    public long brojRacuna(){return broj;}
    public Osoba korisnikRacuna(){return korisnik;}
    public boolean odobravanjePrekoracenja(){return prekoracenje;}
    public double stanjeRacuna(){return uplata;}
}
