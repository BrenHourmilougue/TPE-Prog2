package resolucion;
import resolucion.facultades.Alumno;
import resolucion.Comparadores.Comparador;
import resolucion.Comparadores.ComparadorApellido;
import resolucion.Comparadores.ComparadorDNI;
import java.time.LocalDate;

public class Main {
    public static void main (String[]args){
        Alumno a1 = new Alumno(2,"h","h", LocalDate.now());
        Lista l1 = new Lista<>(new ComparadorDNI());
        l1.add(a1);
    }
}
