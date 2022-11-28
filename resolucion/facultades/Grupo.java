package resolucion.facultades;

import java.util.ArrayList;

public class Grupo extends Elemento{

    private ArrayList<Alumno> alumnos;
    private ArrayList<Grupo> subgrupos;

    public Grupo(String nombre) {
        super(nombre);
        this.alumnos = new ArrayList<>();
        this.subgrupos = new ArrayList<>();
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

    @Override
    public int getCantAlumnos() {
        int cant = 0;
        for (Alumno alumno:alumnos) {
            cant+=alumno.getCantAlumnos();
        }
        for (Grupo grupo:subgrupos) {
            cant+=grupo.getCantAlumnos();
        }
        return cant;
    }
}
