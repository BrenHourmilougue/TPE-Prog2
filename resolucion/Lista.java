package resolucion;

import java.util.Iterator;

import resolucion.Comparadores.Comparador;

public class Lista<T> /* implements Iterable<Nodo>*/{
    private Nodo<T> primero;
    private int size;
    private Comparador orden;
    public Lista (Comparador orden){
        this.primero=null;
        this.orden=orden;
        this.size=0;
    }
    public void add (T valorAInsertar){
        Nodo<T> nuevo = new Nodo<>(valorAInsertar);
        Nodo<T> actual = primero;
        if (primero == null){
            primero = nuevo;

        }
        else {
            while(actual.getSiguiente()!=(null)){
                actual=actual.getSiguiente();
            }
            actual.enlazarSiguiente(nuevo);
        }

    }
    public void addOrdenado(Object valorAInsertar){
        Nodo<T> nuevo = new Nodo<>(valorAInsertar);
        Nodo<T> actual = primero;
        if (actual==(null)){
            primero = nuevo;
        }
        else {
            while(orden.compare(nuevo.getO(), actual.getO())>0 && actual.getSiguiente()!=null){
                actual=actual.getSiguiente();
            }
            nuevo.enlazarSiguiente(actual.getSiguiente());
            actual.enlazarSiguiente(nuevo);
        }

        this.size++;

    }
    /*
    public void mostrarLista(){
        Iterator<Object> it = new Iterador<>(this.primero);
            while (it.hasNext()){
                Object o = it.next();
                System.out.println(o.toString());
            }
    }
*/
    public void setOrden(Comparador orden) {
        this.orden = orden;
        //llame a ordenar();
    }
    public void ordenar(){
        //ordenar burbujeo o alguno por el estilo pero usando el iterator
    }

    public void popPosicion(int i){
        if(primero!=null){
            if(i==0){
                primero = primero.getSiguiente();
                this.size--;
            }else {
                Nodo<T> actual = primero;
                for (int j = 1; j <= i; j++, actual=actual.getSiguiente()) {
                    if (j == i){
                        actual.enlazarSiguiente(actual.getSiguiente().getSiguiente());
                        this.size--;
                    }
                }
            }
        }

    }
    public int obtenerPosicionElemento(Object o){
        Nodo<T> actual = primero;
        int i =0;
        while (actual!=null && !actual.getO().equals(o)){
            actual=actual.getSiguiente();
            i++;
        }
        if(actual != null){
            return i;
        }
        else {
            return -1;
        }
    }
    public void popElemento(Object o){
        int pos = this.obtenerPosicionElemento(o);
        this.popPosicion(pos);
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    public Object get(int i){
        int cont=0;
        Nodo<T> tmp = primero;
        while(cont<i){
            tmp=tmp.getSiguiente();
            cont++;
        }
        return tmp.getO();
    }
    public int size(){
        return size;
    }

}
