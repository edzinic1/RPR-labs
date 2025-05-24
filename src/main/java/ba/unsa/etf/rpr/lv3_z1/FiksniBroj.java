package ba.unsa.etf.rpr.lv3_z1;

import java.util.Comparator;

public class FiksniBroj extends TelefonskiBroj implements Comparable<FiksniBroj> {

    @Override
    public int compareTo(FiksniBroj o) {
        return this.ispisi().compareTo(o.ispisi());
    }

    public enum Grad {
        BIHAĆ("037"), ORAŠJE("031"), TUZLA("035"), ZENICA("032"),
        GORAŽDE("038"), TRAVNIK("030"), MOSTAR("036"), ŠIROKIBRIJEG("039"),
        SARAJEVO("033"), LIVNO("034"), BRČKO("049");
        private final String name;
        private Grad(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }

    private Grad grad;

    public FiksniBroj(Grad grad, String broj) {
        super(broj);
        this.grad = grad;
    }
    @Override
    public String ispisi() {
        return grad.toString() + "/" + super.getBroj();
    }

    @Override
    public int hashCode() { // jel ovo ok??
        return grad.hashCode() + super.getBroj().hashCode();
    }

    public Grad getGrad() {
        return grad;
    }

}
