package ar.edu.unahur.obj2;

public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void pintar(String color) {
        this.color = color;
    }

    public Boolean regular() {
        return true;
    }

    public abstract Double area();

}
