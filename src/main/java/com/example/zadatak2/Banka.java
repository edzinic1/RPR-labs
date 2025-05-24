package com.example.zadatak2;
import com.example.zadatak2.Racun;
import com.example.zadatak2.Korisnik;
import com.example.zadatak2.Uposlenik;
import java.lang.String;
import java.util.List;
public class Banka {
    private List<Korisnik> korisnicii;
    private List<Uposlenik> uposlenicii;
    public Banka(){}
    public long brojRacuna(){
        return brojRacuna();
    }
    public Korisnik kreirajNovogKorisnika(String i, String p){
        Korisnik k = new Korisnik(i, p);
        korisnicii.add(k);
        return k;
    };
    public Uposlenik kreirajNovogUposlenika(String i, String p){
        Uposlenik u = new Uposlenik(i, p);
        uposlenicii.add(u);
        return u;
    }
    public Racun kreirajRacunZaKosrisnika(Korisnik e){
        Racun r = new Racun(0, e);
        return r;
    }
    public List<Korisnik>Korisnici(){
        return korisnicii;
    }
    public List<Uposlenik>Uposlenici(){
        return uposlenicii;
    }
}
