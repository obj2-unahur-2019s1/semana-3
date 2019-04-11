package ar.edu.unahur.obj2;

import java.util.Set;

public class Carrera {

    private String nombre;
    private Set<Materia> materias;
    private Set<Estudiante> estudiantes;

    public Carrera(String nombre, Set<Materia> materias, Set<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.materias = materias;
        this.estudiantes = estudiantes;
        this.estudiantes.stream().forEach(e -> e.getCarreras().add(this));
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }
}
