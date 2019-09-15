package ar.edu.unahur.obj2;

public abstract class Hamburguesa {
    protected int medallonesExtra = 0;

    public void agregarMedallon(){
        if(medallonesExtra <= 2){medallonesExtra++;}
        else System.out.println("No se pueden agregar mas medallones");
    }

    protected int getMedallonesExtra() {
        return medallonesExtra;
    }

    public int getPrecio(){
        return 50 * getMedallonesExtra();
    }

}
