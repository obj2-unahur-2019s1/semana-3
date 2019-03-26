package ar.edu.unahur.obj2;

public class Circulo extends Figura {

    private Integer radio;

    public Circulo(String color, Integer radio) {
        super(color);
        this.radio = radio;
    }

    public Double area() {
        return  Math.PI*Math.pow(radio,2);
    }

    public Double perimetro() {
        return 2*Math.PI*radio;
    }
}
