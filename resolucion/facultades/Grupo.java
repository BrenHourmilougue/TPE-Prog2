package resolucion.facultades;

import java.util.ArrayList;

public class Grupo extends Elemento{

    private ArrayList<Alumno> alumnos;
    private ArrayList<Grupo> subgrupos;

    public Grupo(String nombre, ArrayList<Alumno> alumnos, ArrayList<Grupo> subgrupos) {
        super(nombre);
        this.alumnos = alumnos;
        this.subgrupos = subgrupos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return new ArrayList<Alumno>(alumnos);
    }

    public void addAlumnos(Alumno a) {
        if (!alumnos.contains(a)) {
            alumnos.add(a);
        }
    }

    public ArrayList<Grupo> getSubgrupos() {
        return new ArrayList<Grupo>(subgrupos);
    }

    public void addGrupo(Grupo g) {
        if (!subgrupos.contains(g)) {
            subgrupos.add(g);
        }
    }

}
