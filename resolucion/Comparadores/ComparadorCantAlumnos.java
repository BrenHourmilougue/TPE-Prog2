package resolucion.Comparadores;
import resolucion.facultades.Grupo;

public class ComparadorCantAlumnos extends Comparador{
    public int compare(Grupo o1, Grupo o2) {
        return o1.getCantAlumnos()-o2.getCantAlumnos();
    }
}
