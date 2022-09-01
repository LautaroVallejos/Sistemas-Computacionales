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
public class Main {
    // ### Inicializacion de Objetos ###
    
    //Instancia del Input
    static Scanner input = new Scanner(System.in);
    static int prop;
    
    // Objetos Localidad1 (Avellaneda)
    static Localidad1 prop1Loc1 = new Localidad1();
    static Localidad1 prop2Loc1 = new Localidad1();
    static Localidad1 instanceL1;
     
    //Objetos Localidad2 (Sarandi)
    static Localidad2 prop1Loc2 = new Localidad2();
    static Localidad2 prop2Loc2 = new Localidad2();
    static Localidad2 instanceL2;
    
    //Objetos Localidad3 (Dominico)
    static Localidad3 prop1Loc3 = new Localidad3();
    static Localidad3 prop2Loc3 = new Localidad3();
    static Localidad3 instanceL3;
    
    public static Localidad1 selectInstanceLoc1(){
        System.out.println("\nSelecione la propiedad: \n1. Propiedad n°1 \n2. Propiedad n°2");
        prop = input.nextInt();
        if(prop == 1){
            return prop1Loc1;
        } else {
            return prop2Loc1;
        }
    }
    
    public static Localidad2 selectInstanceLoc2(){
        System.out.println("\nSelecione la propiedad: \n1. Propiedad n°1 \n2. Propiedad n°2");
        prop = input.nextInt();
        if(prop == 1){
            return prop1Loc2;
        } else {
            return prop2Loc2;
        }
    }
    
    public static Localidad3 selectInstanceLoc3(){
        System.out.println("\nSelecione la propiedad: \n1. Propiedad n°1 \n2. Propiedad n°2");
        prop = input.nextInt();
        if(prop == 1){
            return prop1Loc3;
        } else {
            return prop2Loc3;
        }
    }
    
    // Metodo Principal
    public static void main(String[] args) {
        //Inicializacion de variables
        int op;
        int select;
        
        do{
            // Inicio del programa
            System.out.println("\n##### Menu del Programa #####\n");
            
            // Pregunta por la propiedad
            System.out.println("En que localidad se encuentra su propiedad? \n1." + prop1Loc1.localidad + "\n2." + prop1Loc2.localidad + "\n3." + prop1Loc3.localidad);
            select = input.nextInt();
            
            // Selecciona el objeto
            switch(select){
                case 1: instanceL1 = selectInstanceLoc1(); instanceL2 = null; instanceL3 = null; break;
                case 2: instanceL1 = null; instanceL2 = selectInstanceLoc2(); instanceL3 = null; break;
                case 3: instanceL1 = null; instanceL2 = null; instanceL3 = selectInstanceLoc3(); break;
                default: System.out.println("Opcion ingresada no valida"); break;
            }
            
            // Seleciona la accion
            System.out.println("Eliga alguna de las siguientes opciones: \n1.Cargar Datos\n2.Mostrar Datos\n3.Cambiar localidad de una clase\n 4.Salir");
            op = input.nextInt();
            
            switch(op){
                // Ingresar datos
                case 1: {
                    if(instanceL2 == null && instanceL3 == null){
                        instanceL1.setLocalidad();
                    } else if (instanceL1 == null && instanceL3 == null) {
                        instanceL2.setLocalidad();
                    } else {
                        instanceL3.setLocalidad();
                    }
                }; break;
                
                // Mostrar datos
                case 2: {
                    if(instanceL2 == null && instanceL3 == null){
                        instanceL1.getLocalidad();
                    } else if (instanceL1 == null && instanceL3 == null) {
                        instanceL2.getLocalidad();
                    } else {
                        instanceL3.getLocalidad();
                    }
                }; break;
                
                // Cambiar localidad de la clase
                case 3:{
                    if(instanceL2 == null && instanceL3 == null){
                        instanceL1.putLocalidad();
                    } else if (instanceL1 == null && instanceL3 == null) {
                        instanceL2.putLocalidad();
                    } else {
                        instanceL3.putLocalidad();
                    }
                }; break;
                
                // Sale del programa
                case 4: System.out.println("Saliendo del programa");break;
                
                // Opcion por defecto
                default: System.out.println("Opcion ingresada no valida.");
            }
        }while (op != 4);
    }        
}
