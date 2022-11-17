package resolucion.facultades;

import resolucion.Comparadores.ComparadorDNI;
import resolucion.Lista;

public class AgrupacionAlumnos {
    private String nombre; //ej: CEFCE
    private String descripcion;//ej: centro de estudiantes
    private Lista<Alumno>alumnos;

    public AgrupacionAlumnos(String n, String d){
        this.nombre=n;
        this.descripcion=d;
        this.alumnos=new Lista<Alumno>(new ComparadorDNI());
    }
    public void addAlumno(Alumno a){
        this.alumnos.add(a);
    }
}
