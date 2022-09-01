package com.mycompany.encapsulamiento;
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
public class Main {
    public static void main(String[] args){
        //Instanciacion de Objetos
        Alumno alumno0 = new Alumno();
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        
        //Inicio del Programa
        
        //Obj 1
        alumno0.setAlumno();
        alumno0.getAlumno();
        
        //Obj 2
        alumno1.setAlumno();
        alumno1.getAlumno();
        
        //Obj 3
        alumno0.setAlumno();
        alumno0.getAlumno();
        
        //Obj 4 
        alumno0.setAlumno();
        alumno0.getAlumno();
        
        //Mayores
        alumno0.mayor();
        alumno1.mayor();
        alumno2.mayor();
        alumno3.mayor();
        
        
    }
}
