package ar.edu.unahur.obj2;

public class Materia implements Comparable<Materia> {

    private String nombre;
    private int cargaHoraria;
    private Departamento departamento;

    public Materia(String nombre, int cargaHoraria, Departamento departamento) {
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    @Override
    public int compareTo(Materia o) {
        return this.nombre.compareTo(o.nombre);
    }
}
