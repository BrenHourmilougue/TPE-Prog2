package resolucion.facultades;

import resolucion.Comparadores.ComparadorDNI;
import resolucion.Iterador;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Lista<Alumno> getAlumnos() {
        Lista aux = new Lista<Alumno>(new ComparadorDNI());
        Iterador it = new Iterador(alumnos.getPrimero());
        while (it.hasNext()){
            aux.add(it.getCursor().getO());
            it.next();
        }
        return aux;
    }

}
