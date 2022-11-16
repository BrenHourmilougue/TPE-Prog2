package resolucion;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Lista<T> /* implements Iterable<Nodo>*/{
    private Nodo<T> primero;
    //private int size;
    private Comparador<T> orden; //getter y setter. Strategyyyyy
    public Lista (Comparador<T> orden){
        this.primero=null;
        this.orden=orden;
        //this.size=0;
    }
    public void mostrarLista(){
        Iterator it = new Iterador(this.primero);
            while (it.hasNext()){
                Object o = it.next();
                System.out.println(o);
            }
    }
    public void add(T valorAInsertar){
        Nodo<T> nuevo = new Nodo<T>(valorAInsertar);
        Iterator it = new Iterador(this.primero);
        while((orden.compare((T) ((Iterador<T>) it).getCursor().getO(), valorAInsertar)>0)&&(it.hasNext())){
            it.next();
        }
        nuevo.enlazarSiguiente((Nodo) it.next());
        ((Iterador<T>) it).getCursor().enlazarSiguiente(nuevo);

        /*
        Nodo nuevo = new Nodo(o);
        if (primero==null){
            primero=nuevo;
        }
        else if (i==0){

            Nodo tmp = primero;
            nuevo.enlazarSiguiente(tmp);
            primero=nuevo;
        }
        else{
            int cont = 0;
            Nodo tmp = primero;
            Nodo anterior=primero;
            while (cont < i - 1) {
                tmp = tmp.getSiguiente();
                cont++;
            }
            cont = 0;
            while (cont<i-2){
                anterior=anterior.getSiguiente();
                cont++;
            }
            nuevo.enlazarSiguiente(tmp.getSiguiente());
            anterior.enlazarSiguiente(nuevo);
        }
        size++;*/
    }

    public void setOrden(Comparador<T> orden) {
        this.orden = orden;
        //llame a ordenar();
    }
    public void ordenar(){
        //ordenar burbujeo o alguno por el estilo pero usando el iterator
    }

    public void pop(int i){
        if(i==0){
            primero = primero.getSiguiente();
        }else {
            Iterator it = new Iterador(this.primero);
            int cont = 0;
            while (cont < i - 1) {
                it.next();
                cont++;
            }
            //tmp.enlazarSiguiente(tmp.getSiguiente().getSiguiente());
        }
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
    /*public int size(){
        return size;
    }*/

}
