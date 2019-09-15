package ar.edu.unahur.obj2;

public class HamburguesaPollo extends Hamburguesa{
    @Override
    public int getPrecio() {
        return super.getPrecio() + 150;
    }

}
