/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author Coffee Lover
 */
public class ProductosCongelados extends Productos{
    private int tempRecomendada;

    public ProductosCongelados(int tempRecomendada, String nombre, int fechaVencimiento, int numLote, float precio) {
        super(nombre, fechaVencimiento, numLote, precio);
        this.tempRecomendada = tempRecomendada;
    }

    public void getDataChild(){
        System.out.println("Temperatura Recomendada: " + tempRecomendada);
    }
    public int getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(int tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }
    
    
}
