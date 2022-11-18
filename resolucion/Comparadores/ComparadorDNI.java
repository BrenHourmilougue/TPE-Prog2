package resolucion.Comparadores;
import resolucion.facultades.Alumno;

import java.util.Comparator;

public class ComparadorDNI extends Comparador<Alumno>{

    private String nombre;

    public ComparadorDNI(){}
    @Override
    public int compare(Alumno o1, Alumno o2) {
        int dni1 = o1.getDni();
        int dni2 = o2.getDni();
        return dni1-dni2;
    }
}
