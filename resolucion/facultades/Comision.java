package resolucion.facultades;

import resolucion.Comparadores.ComparadorDNI;
import resolucion.Lista;

public class Comision {
    private String nombre;
    private Lista<Alumno>alumnos;

    public Comision(String n){
        this.nombre=n;
        this.alumnos=new Lista<Alumno>(new ComparadorDNI());
    }
    public void addAlumno(Alumno a){
        this.alumnos.add(a);
    }
}
