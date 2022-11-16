package resolucion;

import java.util.Comparator;

public abstract class Comparador<T> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return 0;
    }
}
