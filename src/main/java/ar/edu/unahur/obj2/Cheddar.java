package ar.edu.unahur.obj2;

public class Cheddar extends PapaFrita {

    PapaFrita papita;

    public Cheddar(PapaFrita papita) {
        setPapita(papita);
    }

    public PapaFrita getPapita() {
        return papita;
    }

    public void setPapita(PapaFrita papita) {
        this.papita = papita;
    }

    @Override
    public int getPrecio() {
        return getPapita().getPrecio() + 30;
    }
}
