package ba.unsa.etf.rpr.lv3_z1;
import java.util.*;
import java.util.stream.Collectors;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik;

    public Imenik(){
        imenik = new HashMap<>();
    }

    void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }
    public String dajBroj(String ime){ // valjda ce biti kasno vezivanje??
        return imenik.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj) {
        return imenik.entrySet() // eksperiment
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), broj))
                .map(HashMap.Entry::getKey)
                .collect(Collectors.joining( "" ));

    }
    public String naSlovo(char s){
        String zaIspis = "";
        int brojac = 1;
        for(var kljuc : imenik.keySet()) {
            if (kljuc.startsWith(String.valueOf(s))) {
                zaIspis = zaIspis + brojac + ". " + kljuc + " - " + imenik.get(kljuc).ispisi() + "\n";
                brojac = brojac + 1;
            }
        }
        return zaIspis;
    }
    public Set<String> izGrada(FiksniBroj.Grad g){ // Eksperiment
        return imenik.entrySet()
                .stream()
                .filter(entry -> (entry.getValue() instanceof FiksniBroj && Objects.equals(((FiksniBroj)entry.getValue()).getGrad(), g)))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        var zaVratiti =  imenik.entrySet()
                .stream()
                .filter(entry -> (entry.getValue() instanceof FiksniBroj && Objects.equals(((FiksniBroj)entry.getValue()).getGrad(), g)))
                .map(Map.Entry::getValue)
                .collect(Collectors.toSet());
        zaVratiti = zaVratiti.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new)); // s neta
        return zaVratiti;
    }
}
