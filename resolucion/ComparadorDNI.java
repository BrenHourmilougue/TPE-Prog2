package resolucion;

public class ComparadorDNI<Alumno> extends Comparador<Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {


        int dni1=0;
        int dni2=0;
        return dni1-dni2;
    }
}
