/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Coffee Lover
 */
public class Productos {
    private String nombre;
    private int fechaVencimiento;
    private int numLote;
    private float precio;

    public Productos(String nombre, int fechaVencimiento, int numLote, float precio) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.numLote = numLote;
        this.precio = precio;
    }
    
    public Productos(){
        
    }
    
    public void getData(){
        System.out.println("\nNombre: " + nombre + 
                "\nFecha de Vencimiento: " + fechaVencimiento +
                "\nNumero de Lote: " + numLote +
                "\nPrecio: " + precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}

