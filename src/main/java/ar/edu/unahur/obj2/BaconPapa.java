package ar.edu.unahur.obj2;

public class BaconPapa extends PapaFrita {

    PapaFrita papita;

    public BaconPapa(PapaFrita papita) {
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
        return getPapita().getPrecio() + 45;
    }
}