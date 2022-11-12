package resolucion;

public class Nodo {
    private Nodo siguiente;
    private Object o;

    public Nodo (Object o){
        this.o=o;
        this.siguiente=null;
    }
    public void insert(Object o){
        Nodo nodo = new Nodo (o);
        
    }

}
