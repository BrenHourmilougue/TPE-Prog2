package resolucion.Comparadores;
import resolucion.facultades.Alumno;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
        String a1 = o1.getApellido();
        String a2 = o2.getApellido();
        return 0;
    }
}
