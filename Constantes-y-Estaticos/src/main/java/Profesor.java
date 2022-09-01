/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Coffee Lover
 */
public class Profesor extends Persona {
    private String materia;

    public Profesor(String materia, String nombre, String apellido, String documento, String edad) {
        super(nombre, apellido, documento, edad);
        this.materia = materia;
    }
    
    public void getData(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("\nApellido: " + getApellido());
        System.out.println("\nDocumento: " + getDocumento());
        System.out.println("\nEdad: " + getEdad());
        System.out.println("\nMateria: " + getMateria());
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
    
    
}
