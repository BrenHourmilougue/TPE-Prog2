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
        this.size++;
    }
    public void addOrdenado(Object valorAInsertar){
        Nodo<T> nuevo = new Nodo<>(valorAInsertar);
        Nodo<T> actual = primero;
        Nodo<T>temp = null;
        if (actual==(null)){
            primero = nuevo;
        }
        else {
                while (actual != null && orden.compare(nuevo.getO(), actual.getO()) > 0) {
                    temp = actual;
                    actual = actual.getSiguiente();
                }
                if(orden.compare(primero.getO(),nuevo.getO())>=0){
                    nuevo.enlazarSiguiente(actual);
                    primero=nuevo;
                }
                else {
                    nuevo.enlazarSiguiente(actual);
                    temp.enlazarSiguiente(nuevo);
                }
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
        this.ordenar();
    }
    public void ordenar(){
        if(primero!=null){
            for (int i = 0; i < size(); i++) {
                Nodo<T> actual = primero;
                Nodo<T>anterior = primero;
                Nodo<T> siguiente = primero.getSiguiente();

                while (anterior != null && orden.compare(actual.getO(), anterior.getO()) > 0) {
                    anterior = siguiente;
                    siguiente = siguiente.getSiguiente();
                }
                primero=actual.getSiguiente();
                actual.enlazarSiguiente(siguiente);
                anterior.enlazarSiguiente(actual);
            }
        }

        /*
        int a=0;
        int b;
        Nodo<T> i = primero;
        Nodo<T> aux = new Nodo<>(null);
        while (i.getSiguiente()!=null) {
            a++;
            b = 0;
            Nodo j = primero;
            while (b < this.size() - a - 1) {
                if (orden.compare(j.getSiguiente().getO(), j.getO()) < 0) {
                    aux = j.getSiguiente();
                    j.enlazarSiguiente(aux.getSiguiente());
                    aux.enlazarSiguiente(j);
                }
            }
        }
        i=i.getSiguiente();
         */
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
