package ar.edu.unahur.obj2;

public abstract class Hamburgesa {
    protected int cantidadMedallon = 1;
    protected int precio;

    public void agregarMedallon(){
        if(cantidadMedallon <= 3){cantidadMedallon++;}
        else System.out.println("No puede agregar mas medallones");
    }


    public int precioMedallones(){ return cantidadMedallon * 50; }

    public void agregarQuesoAzul(){

    }
}
