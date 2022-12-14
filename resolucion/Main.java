package resolucion;
import resolucion.Comparadores.*;
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

        f1.addElemento(c1);
        c1.addElemento(m1);
        m1.addElemento(a1);
        m1.addElemento(a2);
        m1.addElemento(a3);

        //Ejercicio 4

        Lista l1 =new Lista<>(new ComparadorInt());
        //a- Crear lista con numeros
        l1.add(10);
        l1.add(21);
        l1.add(1);
        l1.add(5);
        l1.add(11);

        //b- Recorrer e imprimir lista
        System.out.println("Lista con numeros");
        Nodo actual = new Nodo<>(null);
        actual=l1.getPrimero();
        System.out.print("l1(");
        while (actual!=null){
            System.out.print("["+actual.getO()+"]");
            actual = actual.getSiguiente();
        }
        System.out.print(") \n");

        //c- Eliminar elementos por posicion
        l1.popPosicion(0);
        l1.popElemento(5);
        l1.popElemento(11);
        //Recorre nuevamente e imprime
        System.out.println("Lista con numeros despues de eliminar la posicion 0, el elemento que contenga 5 y el q contenga 11");
        actual = l1.getPrimero();
        System.out.print("l1(");
        while (actual!=null){
            System.out.print("["+actual.getO().toString()+"]");
            actual = actual.getSiguiente();
        }
        System.out.print(") \n");


        //d- Crear lista de Strings
        Lista l2 = new Lista<String>(new ComparadorString());

        l2.add("Es");
        l2.add("Facil");
        l2.add("Parcial");
        l2.add("Prog2");

        //e- Recorre e imprime

        actual = l2.getPrimero();
        System.out.print("l2(");
        while (actual!=null){
            System.out.print("["+actual.getO().toString()+"]");
            actual = actual.getSiguiente();
        }
        System.out.print(") \n");

        //f- imprimir por consola en que posicion se encuentra "parcial"
        System.out.println("Posicion Parcial: " + l2.obtenerPosicionElemento("Parcial"));
        //g-imprimir por consola en que posicion se encuentra "recuperatorio"
        System.out.println("Posicion Recuperatorio:" + l2.obtenerPosicionElemento("Recuperatorio") +" (devuelve -1 porque no lo encuentra)");

        //h-cambiar orden lista strings para que queden ordenados descendentemente
        l2.setOrden(new ComparadorString());

        //i- Implementar estructuras e insertar en una lista vinculada ordenadas por cantidad de alumnos

        //ESTRUCTURA UNICEN
        //suelto
        Alumno a4 = new Alumno(1200000, "John", "Doe", LocalDate.of(1999,1,1));
        a4.addIntereses("Intercambio");
        //Alumnos exactas
        Alumno a5 = new Alumno(35999888,"Federico", "Lopez", LocalDate.of(1999,1,1));
        a5.addIntereses("redes");
        a5.addIntereses("php");
        a5.addIntereses("java");
        a5.addIntereses("python");
        Alumno a6 = new Alumno(27123455,"Juana", "Garcia", LocalDate.of(1999,1,1));
        a6.addIntereses("programacion");
        a6.addIntereses("php");
        a6.addIntereses("java");
        //alumno humanas
        Alumno a7 = new Alumno(37124425,"Mora", "Diaz", LocalDate.of(1999,1,1));
        a7.addIntereses("psicologia");
        a7.addIntereses("freud");

        //alumnos historia
        Alumno a8 = new Alumno(34555111,"Flora", "Rivas", LocalDate.of(1999,1,1));
        a8.addIntereses("historia");
        a8.addIntereses("antigua");
        Alumno a9 = new Alumno(34111222,"Martin", "Gomez", LocalDate.of(1999,1,1));
        a9.addIntereses("romanos");
        a9.addIntereses("egipcios");
        a9.addIntereses("griegos");
        Alumno a10 = new Alumno(32555111,"Roman", "Bazan", LocalDate.of(1999,1,1));
        a10.addIntereses("argentina");

        Grupo g1 = new Grupo("Historia");
        g1.addElemento(a10);
        g1.addElemento(a9);
        g1.addElemento(a8);

        Grupo g2 = new Grupo("Humanas");
        g2.addElemento(a7);
        g2.addElemento(g1);

        Grupo g3 = new Grupo("Exactas");
        g3.addElemento(a5);
        g3.addElemento(a6);

        Grupo g4 = new Grupo("UNICEN");
        g4.addElemento(g3);
        g4.addElemento(g2);
        g4.addElemento(a4);

        //ESTRUCTURA OLIMPIADAS

        //Matea2 alumnos

        Alumno a11 = new Alumno(33222444, "Juan", "Juarez", LocalDate.of(1997,12,25));
        Alumno a12 = new Alumno(33222111, "Julio", "Cesar", LocalDate.of(1998, 9, 6));
        a11.addIntereses("Sucesiones");
        a11.addIntereses("algebra");
        a12.addIntereses("Sucesiones");
        a12.addIntereses("algebra");

        Grupo g5 = new Grupo("Matea2");
        g5.addElemento(a11);
        g5.addElemento(a12);

        //Los Fibo
        Alumno a13 = new Alumno(30987654, "Benardino", "Rivas", LocalDate.of(1997,12,25));
        Alumno a14 = new Alumno(33322112, "Jose", "Paso", LocalDate.of(1998, 9, 6));
        Alumno a15 = new Alumno(12343565, "Isaac", "Newton", LocalDate.of(1995, 2, 22));
        a13.addIntereses("matematicas");
        a14.addIntereses("problemas");
        a15.addIntereses("sucesiones");

        Grupo g6 = new Grupo("Los Fibo");
        g6.addElemento(a13);
        g6.addElemento(a14);
        g6.addElemento(a15);

        Grupo g7 = new Grupo("Olimpiadas Matematicas");
        g7.addElemento(g6);
        g7.addElemento(g5);

        //Crea la lista y agrega ordenados por cantidad de alumnos
        Lista ejercicio4i = new Lista<Grupo>(new ComparadorCantAlumnos());
        ejercicio4i.addOrdenado(g7);
        ejercicio4i.addOrdenado(g6);

        System.out.println("Estructuras guardadas en una Lista vinculada");
        actual = ejercicio4i.getPrimero();
        while (actual!=null){
            System.out.println(actual.getO().toString());
            actual = actual.getSiguiente();
        }

        l1.add(2);
        l1.add(23);
        l1.add(5);
        l1.ordenar();
        System.out.println("l1 ordenada");
        actual = l1.getPrimero();
        System.out.print("l1(");
        while (actual!=null){
            System.out.print("["+actual.getO().toString()+"]");
            actual = actual.getSiguiente();
        }
        System.out.print(") \n");
    }
}
