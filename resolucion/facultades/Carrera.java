package resolucion.facultades;

import resolucion.Comparadores.Comparador;
import resolucion.Comparadores.ComparadorNombre;
import resolucion.Lista;

public class Carrera {
    private String nombre;
    private Lista<Materia>materias;
    private Lista<Alumno>alumnos;

    public Carrera(String n){
        this.nombre=n;
        this.materias=new Lista<Materia>(new ComparadorNombre<>());
        this.alumnos=new Lista<Alumno>(new ComparadorNombre<>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addMateria(Materia m){
        this.materias.add(m);
    }
    public void addAlumno(Alumno a){
        this.alumnos.add(a);
    }
}
