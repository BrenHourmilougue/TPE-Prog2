package resolucion.facultades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Elemento{
    private int dni;
    private String apellido;
    private LocalDate fnac;
    private ArrayList<String>intereses;

    public Alumno (int dni, String nombre, String apellido, LocalDate fnac){
        super(nombre);
        this.dni=dni;
        this.apellido=apellido;
        this.fnac=fnac;
        this.intereses=new ArrayList<String>();
    }
    public void addIntereses(String s){
        if (!intereses.contains(s)) {
            intereses.add(s);
        }
        //agregar interes
    }

    public ArrayList<String> getIntereses() {
        return new ArrayList<String>(intereses);
    }

    public int getEdad(){
        return LocalDate.now().getYear()-this.fnac.getYear();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFnac() {
        return fnac;
    }

    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }
}
