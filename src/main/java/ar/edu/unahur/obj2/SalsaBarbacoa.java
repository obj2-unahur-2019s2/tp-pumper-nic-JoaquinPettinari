package ar.edu.unahur.obj2;

public class SalsaBarbacoa extends PapaFrita {

    PapaFrita papita;

    public SalsaBarbacoa(PapaFrita papita) {
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
        return getPapita().getPrecio() + 20;
    }
}
