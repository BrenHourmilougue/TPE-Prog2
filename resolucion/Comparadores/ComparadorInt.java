package resolucion.Comparadores;

public class ComparadorInt<T> extends Comparador<T>{
    //No me deja poner int en <T> porque es de tipo primitivo. As{i como está no compila pero si
    //le paso int al compare no es el mismo compare que el de Comparator
    @Override
    public int compare(T o1,T o2) {

        return o1-o2;
    }
}
