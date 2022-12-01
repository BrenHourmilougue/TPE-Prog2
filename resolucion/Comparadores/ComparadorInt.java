package resolucion.Comparadores;

public class ComparadorInt extends Comparador<Integer>{
    //No me deja poner int en <T> porque es de tipo primitivo. As{i como está no compila pero si
    //le paso int al compare no es el mismo compare que el de Comparator
    @Override
    public int compare(Integer o1,Integer o2) {

        return o1-o2;
    }
}
