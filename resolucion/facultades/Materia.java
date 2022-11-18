package resolucion.facultades;
import resolucion.Comparadores.ComparadorNombre;
import resolucion.Lista;

public class Materia {
    private String nombre;
    private Lista<Comision>comisiones;

    private Lista<Alumno>alumnos;

    public Materia(String n){
        this.nombre=n;
        this.alumnos=new Lista<Alumno>(new ComparadorNombre<>());
    }
    public void addAlumno(Alumno a){
        this.alumnos.add(a);
    }
    public String getNombre() {
        return nombre;
    }
}
