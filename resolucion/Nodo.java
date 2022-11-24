package resolucion;

public class Nodo<T> {
    private Nodo<T> siguiente;
    private Object o;

    public Nodo (Object o){
        this.o=o;
        this.siguiente=null;
    }
    public void enlazarSiguiente(Nodo<T> n){
        siguiente=n;
    }
    public void insert(Object o){
        Nodo<T> nodo = new Nodo<T> (o);
        
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    public Object getO() {
        return o;
    }
}
