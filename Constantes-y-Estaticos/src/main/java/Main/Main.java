package Main;

//Consigna
import java.util.Scanner;

//=====================================
/*
    Realizar un programa para una escuela que guarde el nombre de curso,
    la cantidad de alumnos que tiene y la cantidad de materias que hay en
    ese curso, luego mediante un menú de opciones el programa debe
    realizar lo siguiente: 1-Mostrar los datos, 2-Mostrar la cantidad de
    materias que tiene el curso con mayor cantidad de alumnos, 3-Mostrar el
    promedio de alumnos por curso y 4-Salir.
    Para guardar los datos se debe crear la clase Curso, los atributos que
    guardan el nombre del curso y la cantidad de alumnos deben ser
    constantes, el método principal (main) debe estar en otra clase y en
    dicho método se debe crear al menos 4 objetos de la clase Curso para
    ejecutar lo que pide el programa.
*/
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Inicializacion de Objetos
        Curso obj1 = new Curso("4to Prog", 20, 10);
        Curso obj2 = new Curso("5to Prog", 30, 12);
        Curso obj3 = new Curso("6to Prog", 15, 14);
        Curso obj4 = new Curso("7mo Prog", 21, 8);
        
        //Inicio del programa
        do {
           System.out.println("================================");
           System.out.println("\nInicio del programa: ");
           System.out.println("*****Menú*****");
           System.out.println("1. Mostrar datos \n2. Mostrar cantidad de materias del curso con mayor alumnos. \n3. Mostrar el promedio de la cantidad de alumnos entre los cursos. \n4. Salir");
           
        }while();
        
        obj1.getCurso();
        obj2.getCurso();
        obj3.getCurso();
        obj4.getCurso();
    }
    
    
    
}
