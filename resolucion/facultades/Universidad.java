package resolucion.facultades;

import resolucion.Comparadores.ComparadorNombre;
import resolucion.Lista;

public class Universidad {
    private static Universidad unicaInstancia;
    private String rector;
    private Lista<Facultad> facultades;

    private Universidad(){
        this.facultades=new Lista<>(new ComparadorNombre<>());
    }
    public static Universidad getInstance(){
        if(unicaInstancia==null){
            unicaInstancia = new Universidad();
        }
        return unicaInstancia;
    }
    public void addFacultad(Facultad f){
        this.facultades.add(f);
    }

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }
}
