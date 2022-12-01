package resolucion.Comparadores;

import resolucion.facultades.Elemento;

public class ComparadorNombre extends Comparador<Elemento>{
    public int compare(Elemento o1, Elemento o2) {
        String n1 = o1.getNombre();
        String n2= o2.getNombre();
        return n1.compareTo(n2);
    }

}
