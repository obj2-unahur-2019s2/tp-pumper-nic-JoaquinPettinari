package ar.edu.unahur.obj2;

public class HamburgesaCarne extends Hamburgesa {

    public HamburgesaCarne(){
        super();
    }


    public int precio() {
        return this.precioMedallones() + 200;
    }
}
