package resolucion;
import resolucion.Comparadores.ComparadorInt;
import resolucion.facultades.Alumno;
import resolucion.Comparadores.Comparador;
import resolucion.Comparadores.ComparadorApellido;
import resolucion.Comparadores.ComparadorDNI;
import resolucion.facultades.Carrera;
import resolucion.facultades.Facultad;
import resolucion.facultades.Materia;

import java.time.LocalDate;

public class Main {
    public static void main (String[]args){

        Facultad f1 = new Facultad("Exactas");
        Carrera c1 = new Carrera("TUDAI");
        Materia m1 = new Materia("Programacion 2");
        Alumno a1 =new Alumno(1,"Bren","Hormiga",LocalDate.now());
        Alumno a2 =new Alumno(2,"Juanito", "Alcachofa", LocalDate.now());
        Alumno a3 =new Alumno(3, "Agus", "Tincito", LocalDate.now());

        f1.addCarrera(c1);
        c1.addMateria(m1);
        m1.addAlumno(a1);
        m1.addAlumno(a2);
        m1.addAlumno(a3);

        Lista l1 =new Lista<>(new ComparadorInt());
//En la clase de sole decia que el metodo instertar debia insertar ordenado
        l1.add(10);
        l1.add(21);
        l1.add(1);
        l1.add(5);
        l1.add(11);

        l1.mostrarLista();

        l1.popPosicion(0);
        l1.popElemento(5);
        l1.popElemento(11);
        l1.mostrarLista();
    }
}
