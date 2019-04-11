package ar.edu.unahur.obj2;

import java.util.Set;

public class Carrera {

    private String nombre;
    private Set<Materia> materias;

    public Carrera(String nombre, Set<Materia> materias) {
        this.nombre = nombre;
        this.materias = materias;
    }
}
