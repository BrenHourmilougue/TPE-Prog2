package resolucion;

public class ComparadorDNI<Alumno> extends Comparador<Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
        int dni1=o1.getDni();
        int dni2=o2.getDni;
        return dni1-dni2;
    }
}
