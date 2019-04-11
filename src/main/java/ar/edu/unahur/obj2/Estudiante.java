package ar.edu.unahur.obj2;

import java.util.Objects;
import java.util.Set;

public class Estudiante {

    private String nombre;
    private String apellido;
    private Set<Carrera> carreras;


    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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
}
