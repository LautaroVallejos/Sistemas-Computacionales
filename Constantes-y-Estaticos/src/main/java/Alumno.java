/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Coffee Lover
 */
public class Alumno extends Persona {
    //Inicializacion de Variables
    private float nota;
    private String curso;
    
    //Constructor
    public Alumno(float nota, String curso, String nombre, String apellido, String documento, String edad) {
        super(nombre, apellido, documento, edad);
        this.nota = nota;
        this.curso = curso;
    }

    public void getData(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("\nApellido: " + getApellido());
        System.out.println("\nDocumento: " + getDocumento());
        System.out.println("\nEdad: " + getEdad());
        System.out.println("\nNota: " + getNota());
        System.out.println("\nCurso: " + getCurso());
    }
    
    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
