package resolucion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno {
    private int dni;
    private String nombre, apellido;
    private LocalDate fnac;
    private ArrayList<String>intereses;

    public Alumno (int dni, String nombre, String apellido, LocalDate fnac){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fnac=fnac;
        this.intereses=new ArrayList<String>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
