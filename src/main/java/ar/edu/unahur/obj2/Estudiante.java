package ar.edu.unahur.obj2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Estudiante {

    private String nombre;
    private String apellido;
    private Set<Carrera> carreras;


    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carreras = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Set<Carrera> getCarreras() {
        return carreras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante estudiante = (Estudiante) o;
        return getNombre().equals(estudiante.getNombre()) &&
                getApellido().equals(estudiante.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido());
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Set<Materia> materias() {
        return carreras.stream()
                .flatMap(d -> d.getMaterias().stream())
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<Materia> materiasPorDepartamento(Departamento departamento) {
        return materias().stream()
                .filter(m -> m.getDepartamento().equals(departamento))
                .collect(Collectors.toSet());
    }
}
