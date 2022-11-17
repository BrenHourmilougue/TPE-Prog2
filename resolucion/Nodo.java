package resolucion;
import resolucion.facultades.Alumno;
import resolucion.Comparadores.Comparador;
import resolucion.Comparadores.ComparadorApellido;
import resolucion.Comparadores.ComparadorDNI;

public class Nodo<T> {
    private Nodo<T> siguiente;
    private Object o;

    public Nodo (Object o){
        this.o=o;
        this.siguiente=null;
    }
    public void enlazarSiguiente(Nodo n){
        siguiente=n;
    }
    public void insert(Object o){
        Nodo nodo = new Nodo (o);
        
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    public Object getO() {
        return o;
    }
}
