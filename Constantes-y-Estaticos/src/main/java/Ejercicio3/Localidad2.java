/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Coffee Lover
 */

public class Localidad2 {
    // Instancia de Input
    static Scanner input = new Scanner(System.in);
    
    // Declaracion de Atributos
    protected static String localidad = "Sarandí";
    protected static String newLocalidad; 
    private float precio;
    private String direccion;

    // Constuctor
    public Localidad2(float precio, String direccion) {
        this.precio = precio;
        this.direccion = direccion;
    }
     
    // Metodo Principal
    public Localidad2(){
        
    }
    
    // Metodo de seteo de Localidad
    public void setLocalidad(){
        System.out.println("##### Seteo de Localidad 2 #####\n");
        System.out.println("Ingrese el precio de la propiedad: ");
        precio = input.nextFloat();  
        input.nextLine();
        System.out.println("\nIngrese la direccion de la propiedad: ");
        direccion = input.nextLine();
    }
    
    //Metodo de obtencion de Localidad
    public void getLocalidad(){
        System.out.println("##### Obtencion de Localidad 2 #####\n");
        System.out.println("La localidad de la propiedad es: " + localidad);
        System.out.println("\nEl precio de la propiedad es: " + precio);
        System.out.println("\nLa direccion de la propiedad es: " + direccion);
    }
    
    //Metodo cambio de Localidad
    public void putLocalidad(){
        System.out.println("Ingrese la nueva localidad: ");
        newLocalidad = input.nextLine();
        this.localidad = newLocalidad;
    }
    
}
