package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CirculoTest {

    @BeforeTest
    public void setUp() {

    }



    @Test
    public void saludoExitoso() {
        Circulo c1 = new Circulo(20);

        Double superficieEsperada = Math.PI*Math.pow(20,2);

        Assert.assertEquals(superficieEsperada, c1.superficie());

    }

}
