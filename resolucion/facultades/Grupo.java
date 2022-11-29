package resolucion.facultades;

import java.util.ArrayList;

public class Grupo extends Elemento{

    private ArrayList<Elemento> elementos;

    public Grupo(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public ArrayList<Elemento> getElementos() {
        return new ArrayList<Elemento>(elementos);
    }

    public void addElemento(Elemento e) {
        if (!elementos.contains(e)) {
            elementos.add(e);
        }
    }

    @Override
    public int getCantAlumnos() {
        int cant = 0;
        for (Elemento e:elementos) {
            cant+=e.getCantAlumnos();
        }
        return cant;
    }
}
