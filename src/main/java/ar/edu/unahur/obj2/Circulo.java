package ar.edu.unahur.obj2;

public class Circulo extends Figura {

    private Integer radio;

    public Circulo(Integer radio) {
        this.radio = radio;
    }

    public Double superficie() {
        return  Math.PI*Math.pow(radio,2);
    }

    public Double perimetro() {
        return 2*Math.PI*radio;
    }
}
