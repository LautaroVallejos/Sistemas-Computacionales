package com.mycompany.encapsulamiento;
import java.util.Scanner;
/**
 * @author Coffee Lover
 * 
 * Tengo en la clase alumno con los siguientes atributos encapsulados:
    nombre, apellido, edad y año que cursa. En la clase Main que tiene al
    método principal voy a crear 4 objetos de la clase alumno (si se anima
    puede usar un vector de objetos), debo cargar los atributos por consola
    usando los métodos setters y luego debo mostrar el promedio de
    edad(de los 4 alumnos), nombre y apellido de los alumnos mayores a 18
    años y cuántos alumnos están en séptimo año (al tener que hacer todo
    esto desde la clase Main va a tener que utilizar los métodos getters para
    obtener los datos de los atributos y realizar los procedimientos
    necesarios, puede crear métodos para hacer los procedimientos
    pedidos).
 */
public class Alumno {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private int curso;
    static Scanner input = new Scanner(System.in);   
    
//    private void Alumno(){
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.edad = edad;
//        this.curso = curso;
//    }
    
    //Setear Atributos
    public void setNombre(){
        System.out.println("Setear Nombre: ");
        this.nombre = input.nextLine();
    }
    
    public void setApellido(){
        System.out.println("\nSetear Apellido: ");
        this.apellido = input.nextLine();
    }
    
    public void setEdad(){
        System.out.println("\nSetear Edad: ");
        this.edad = input.nextInt();
    }
    
    public void setCurso(){
        System.out.println("\nSetear Curso: ");
        this.curso = input.nextInt(); input.nextLine();
    }
    
    //Mostrar Atrubutos
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getCurso(){
        return curso;
    }
    
    public void setAlumno(){
        this.setNombre();
        this.setApellido();
        this.setEdad();
        this.setCurso();
    }
    
    public void getAlumno(){
        String name = this.getNombre();
        System.out.println("El nombre es: " + name);
        
        String surname = this.getApellido();
        System.out.println("El apellido es: " + surname);

        int age = this.getEdad();
        System.out.println("La edad es: " + age);
        
        int course = this.getCurso();
        System.out.println("El curso es: " + course);
    }
    
    public void mayor(){
        if(edad>=16){
            System.out.println(nombre + " es mayor de edad!!");
        }
    }
    
    public void promedio(){
        
    }
}
