package resolucion.Comparadores;

import resolucion.facultades.AgrupacionAlumnos;
import resolucion.facultades.Alumno;
import resolucion.facultades.Carrera;
import resolucion.facultades.Comision;
import resolucion.facultades.Facultad;
import resolucion.facultades.Materia;
public class ComparadorNombre<T> extends Comparador<T>{
    //prectica horrible, me duelen los ojos, pero no se como hacer que funcione. Arreglar
    public int compare(Alumno o1, Alumno o2) {
        String n1 = o1.getNombre();
        String n2= o2.getNombre();
        return n1.compareTo(n2);
    }
    public int compare(AgrupacionAlumnos o1, AgrupacionAlumnos o2) {
        String n1 = o1.getNombre();
        String n2= o2.getNombre();
        return n1.compareTo(n2);
    }
    public int compare(Carrera o1, Carrera o2) {
        String n1 = o1.getNombre();
        String n2= o2.getNombre();
        return n1.compareTo(n2);
    }
    public int compare(Comision o1, Comision o2) {
        String n1 = o1.getNombre();
        String n2= o2.getNombre();
        return n1.compareTo(n2);
    }
    public int compare(Facultad o1, Facultad o2) {
        String n1 = o1.getNombre();
        String n2= o2.getNombre();
        return n1.compareTo(n2);
    }
    public int compare(Materia o1, Materia o2) {
        String n1 = o1.getNombre();
        String n2= o2.getNombre();
        return n1.compareTo(n2);
    }

}
