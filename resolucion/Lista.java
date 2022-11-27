package resolucion;

import java.util.Iterator;

import resolucion.Comparadores.Comparador;

public class Lista<T> /* implements Iterable<Nodo>*/{
    private Nodo<T> primero;
    private int size;
    private Comparador<T> orden;
    public Lista (Comparador orden){
        this.primero=null;
        this.orden=orden;
        this.size=0;
    }
    public void add (T valorAInsertar){
        Nodo<T> nuevo = new Nodo<T>(valorAInsertar);
        Nodo<T> actual = primero;
        if (actual==null){
            actual = nuevo;
        }
        else {
            while(actual.getSiguiente()!=(null)){
                actual=actual.getSiguiente();
            }
            actual.enlazarSiguiente(nuevo);
        }

    }
    public void addOrdenado(T valorAInsertar){
        Nodo<T> nuevo = new Nodo<T>(valorAInsertar);
        Nodo<T> actual = primero;
        if (actual==(null)){
            actual = nuevo;
        }
        else {
            while(orden.compare((T) nuevo, (T) actual)>0 && actual.getSiguiente()!=null){
                actual=actual.getSiguiente();
            }
            nuevo.enlazarSiguiente(actual.getSiguiente());
            actual.enlazarSiguiente(nuevo);
        }

        this.size++;

    }
    public void mostrarLista(){
        Iterator it = new Iterador(this.primero);
            while (it.hasNext()){
                Object o = it.next();
                System.out.println(o.toString());
            }
    }

    public void setOrden(Comparador<T> orden) {
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
        if (actual!=null){
            int i =0;
            while (!actual.getO().equals(o)){
                actual=actual.getSiguiente();
                i++;
            }
            return i;
        }
        else {
            return -1;
        }
    }
    public void popElemento(Object o){
        Nodo<T> actual = primero;
        for (int i=0;i<this.size();i++){
            if (actual.getO().equals(o)){
                actual.enlazarSiguiente(actual.getSiguiente().getSiguiente());
                this.size--;
            }
            actual=actual.getSiguiente();
        }
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    public Object get(int i){
        int cont=0;
        Nodo tmp = primero;
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
