import ar.edu.unahur.obj2.Carrera;
import ar.edu.unahur.obj2.Departamento;
import ar.edu.unahur.obj2.Estudiante;
import ar.edu.unahur.obj2.Materia;
import org.testng.annotations.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MateriaTest {

    @Test
    public void testGetNombre() {

        Materia programacionDos = new Materia("Programacion con Objetos II", 6, Departamento.Informatica);
    }

    @Test
    public void testGetCargaHoraria() {
        Materia programacionUno = new Materia("Programacion con Objetos I1", 8, Departamento.Informatica);
        Materia programacionDos = new Materia("Programacion con Objetos II", 6, Departamento.Informatica);

        Estudiante estudiante1 = new Estudiante("Juan", "Pérez");

        Carrera tecni = new Carrera("Tecnicatura en Informatica", Stream.of(programacionUno, programacionDos).collect(Collectors.toSet())
                ,Stream.of(estudiante1).collect(Collectors.toSet()));

    }

    @Test
    public void testGetDepartamento() {
    }
}