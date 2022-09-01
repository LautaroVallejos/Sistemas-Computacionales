package Main;
import java.util.Scanner;
public class Curso {
    private final String nombre;
    private final int cantAlum;
    private final int cantMaterias;
    protected static Scanner input = new Scanner(System.in);

    public Curso(String nombre, int cantAlum, int cantMaterias) {
        this.nombre = nombre;
        this.cantAlum = cantAlum;
        this.cantMaterias = cantMaterias;
    }
    
    public void getCurso(){
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("\nCantidad de alumnos: " + cantAlum);
        System.out.println("\n Cantidad de materias: " + cantMaterias);
    }
}
