package ar.edu.unahur.obj2;

public class HamburguesaCarne extends Hamburguesa {

    @Override
    public int getPrecio() {
        return super.getPrecio() + 200;
    }

}

