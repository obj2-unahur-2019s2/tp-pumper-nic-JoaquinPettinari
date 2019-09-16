package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MenuTest {
    Menu m1;
    Hamburguesa hamburguesa;
    PapaFrita papaFrita;

    @BeforeTest
    public void setup(){
        hamburguesa = new HamburguesaCarne();
        hamburguesa = new QuesoAzul(hamburguesa);
        hamburguesa = new Huevo(hamburguesa);

        papaFrita = new PapaGrande();
        papaFrita = new Cheddar(papaFrita);
        papaFrita = new BaconPapa(papaFrita);

        m1 = new Menu(hamburguesa, papaFrita);
    }

    @Test
    public void precio(){
        Assert.assertEquals(300.0, m1.precio());
    }



}