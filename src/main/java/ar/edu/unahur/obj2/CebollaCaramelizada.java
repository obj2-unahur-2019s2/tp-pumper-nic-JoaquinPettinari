package ar.edu.unahur.obj2;

public class CebollaCaramelizada extends Hamburguesa {
    Hamburguesa hamburguesa;

    public CebollaCaramelizada(Hamburguesa hamburguesa){
        setHamburguesa(hamburguesa);
    }

    public void setHamburguesa(Hamburguesa hamburguesa){
        this.hamburguesa = hamburguesa;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    @Override
    public int getPrecio() {
        return getHamburguesa().getPrecio() + 60;
    }
}
