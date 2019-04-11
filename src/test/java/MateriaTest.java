import ar.edu.unahur.obj2.Departamento;
import ar.edu.unahur.obj2.Materia;
import org.testng.annotations.Test;

public class MateriaTest {

    @Test
    public void testGetNombre() {

        Materia programacionDos = new Materia("Programacion con Objetos II", 6, Departamento.Informatica);
    }

    @Test
    public void testGetCargaHoraria() {
    }

    @Test
    public void testGetDepartamento() {
    }
}