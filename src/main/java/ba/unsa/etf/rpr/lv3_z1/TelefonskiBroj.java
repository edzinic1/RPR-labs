package ba.unsa.etf.rpr.lv3_z1;

public abstract class TelefonskiBroj {
    private String broj;

    public TelefonskiBroj(String broj){
        this.broj = broj;
    }
    public String getBroj(){
        return broj;
    }
    public abstract String ispisi();
    public abstract int hashCode();
    public boolean equals(Object o){
        TelefonskiBroj provjeri = (TelefonskiBroj)o;
        return broj.equals(provjeri.getBroj());
    }
}

