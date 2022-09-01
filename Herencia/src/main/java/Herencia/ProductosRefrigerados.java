/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Coffee Lover
 */
public class ProductosRefrigerados extends Productos{
    private int senasaCode;

    public ProductosRefrigerados(int SenasaCode, String nombre, int fechaVencimiento, int numLote, float precio) {
        super(nombre, fechaVencimiento, numLote, precio);
        this.senasaCode = SenasaCode;
    }
    
    public void getDataChild(){
        System.out.println("Codigo Senasa: " + senasaCode);
    }

    public int getSenasaCode() {
        return senasaCode;
    }

    public void setSenasaCode(int SenasaCode) {
        this.senasaCode = SenasaCode;
    }
    
    
}
