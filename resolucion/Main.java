package resolucion;
import resolucion.Comparadores.Comparador;
import resolucion.Comparadores.ComparadorInt;
import resolucion.Comparadores.ComparadorNombre;
import resolucion.facultades.Alumno;
import resolucion.facultades.Grupo;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main (String[]args){

        //Prueba composite alumnos y facultades
        Grupo f1 = new Grupo("Exactas");
        Grupo c1 = new Grupo("TUDAI");
        Grupo m1 = new Grupo("Programacion 2");
        Alumno a1 =new Alumno(1,"Bren","Hormiga",LocalDate.now());
        Alumno a2 =new Alumno(2,"Juanito", "Alcachofa", LocalDate.now());
        Alumno a3 =new Alumno(3, "Agus", "Tincito", LocalDate.now());

        f1.addGrupo(c1);
        c1.addGrupo(m1);
        m1.addAlumnos(a1);
        m1.addAlumnos(a2);
        m1.addAlumnos(a3);

        //Ejercicio 4

        Lista l1 =new Lista<>(new ComparadorInt());
        //a- Crear lista con numeros
        l1.add(10);
        l1.add(21);
        l1.add(1);
        l1.add(5);
        l1.add(11);

        //b- Recorrer e imprimir lista
        l1.mostrarLista();
        //c- Eliminar elementos por posicion
        l1.popPosicion(0);
        l1.popElemento(5);
        l1.popElemento(11);
        //Recorre nuevamente e imprime
        l1.mostrarLista();


        //d- Crear lista de Strings
        Lista l2 = new Lista<String>(new ComparadorNombre());

        l2.add("Es");
        l2.add("Facil");
        l2.add("Parcial");
        l2.add("Prog2");
        //e- Recorre e imprime
        l2.mostrarLista();
        //f- imprimir por consola en que posicion se encuentra "parcial"
        System.out.println(l2.obtenerPosicionElemento("Parcial"));
        //g-imprimir por consola en que posicion se encuentra "recuperatorio"
        System.out.println(l2.obtenerPosicionElemento("Recuperatorio"));

        //h-cambiar orden lista strings para que queden ordenados descendaentemente
        l2.setOrden(new ComparadorNombre());
    }
}
