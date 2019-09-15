package ar.edu.unahur.obj2;

public class HamburguesaLentejas extends Hamburguesa {
    @Override
    public int getPrecio() {
        return super.getPrecio() + 220;
    }
}
