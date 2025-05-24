package com.example.lv4z1;
import com.example.lv4z1.Laptop;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface LaptopDao{
    void dodajLaptopUListu(Laptop laptop);
    void dodajLaptopUFile(Laptop laptop) throws FileNotFoundException;
    Laptop getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);
    void vratiPodatkeIzDatoteke();
}
