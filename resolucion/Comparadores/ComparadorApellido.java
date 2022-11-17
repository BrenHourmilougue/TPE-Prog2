package resolucion.Comparadores;

public class ComparadorApellido<Alumno> extends Comparador<Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
        String a1 = o1.getApellido();
        return 0;
    }
}
