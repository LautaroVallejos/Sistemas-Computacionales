/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Coffee Lover
 */
public class ProductosFrescos extends Productos{
    private int fechaDeEnvasado;
    private String paisDeOrigen;

    public ProductosFrescos(int fechaDeEnvasado, String paisDeOrigen, String nombre, int fechaVencimiento, int numLote, float precio) {
        super(nombre, fechaVencimiento, numLote, precio);
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.paisDeOrigen = paisDeOrigen;
    }
    
    public void getDataChild(){
        System.out.println("Fecha de Envasado: " + fechaDeEnvasado +
                "\nPais de Origen: " + paisDeOrigen);
    }

    public int getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    public void setFechaDeEnvasado(int fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
    
    
}
