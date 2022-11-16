package resolucion;

import java.util.Iterator;

public class Iterador<T> implements Iterator<T> {
    private Nodo<T> cursor;
    public Iterador(Nodo n){
        this.cursor=n;
    }
    @Override
    public boolean hasNext() {
        return this.cursor!=null;
    }

    @Override
    public T next() {
        Object value =cursor.getO();
        cursor = cursor.getSiguiente();
        return (T) value;
    }

    public Nodo<T> getCursor() {
        return cursor;
    }
}
