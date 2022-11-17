package resolucion.facultades;

import resolucion.Comparadores.ComparadorNombre;
import resolucion.Lista;

public class Facultad {
    private String nombre;
    private Lista<Carrera>carreras;
    private Lista<Alumno>alumnos;

    public Facultad(String n){
        this.nombre=n;
        this.carreras=new Lista<Carrera>(new ComparadorNombre<>());
        this.alumnos=new Lista<Alumno>(new ComparadorNombre<>());
    }
    public void addCarrera(Carrera c){
        this.carreras.add(c);
    }
    public void addAlumno(Alumno a){
        this.alumnos.add(a);
    }
}
