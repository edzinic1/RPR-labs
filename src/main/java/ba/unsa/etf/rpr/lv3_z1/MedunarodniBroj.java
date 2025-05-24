package ba.unsa.etf.rpr.lv3_z1;
public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;

    public MedunarodniBroj(String drzava, String broj) {
        super(broj);
        this.drzava = drzava;
    }

    @Override
    public String ispisi() {
        return drzava + "/" + super.getBroj();
    }

    public String getDrzava() {
        return drzava;
    }
    @Override
    public int hashCode(){
        return drzava.hashCode() + super.getBroj().hashCode();
    }
}
