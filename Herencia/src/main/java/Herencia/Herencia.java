/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Herencia;

/**
 *
 * @author Coffee Lover
 */
public class Herencia {

    public static void main(String[] args) {
        // Inicializacion de Instancias
        ProductosRefrigerados pr1 = new ProductosRefrigerados(452050, "Mayonesa Natura", 20082022, 01, 250);
        ProductosRefrigerados pr2 = new ProductosRefrigerados(452051, "Coca-Cola", 20082022, 02, 350);
        ProductosCongelados pc1 = new ProductosCongelados(5, "Papas McCain", 14072022, 01, 560);
        ProductosCongelados pc2 = new ProductosCongelados(0, "Helado Grido", 14072022, 02, 1050);
        ProductosFrescos pf1 = new ProductosFrescos(20042022, "Brasil", "Manos Naranja", 30072022, 01, 280);
        ProductosFrescos pf2 = new ProductosFrescos(31042022, "China", "Maru-chan", 30082022, 01, 280);
        
        // Mostrando todos los datos de las instancias
        pr1.getData(); pr1.getDataChild();
        pr2.getData(); pr2.getDataChild();
        pc1.getData(); pc1.getDataChild();
        pc2.getData(); pc2.getDataChild();
        pf1.getData(); pf1.getDataChild();
        pf2.getData(); pf2.getDataChild();
        
        // Modificacion de las instancias
        pr1.setPrecio(600); System.out.println("Precio Actualizado: " + pr1.getPrecio());
        pc1.setTempRecomendada(0); System.out.println("Temperatura Actualizada: " + pc1.getTempRecomendada());
        pf1.setPaisDeOrigen("Paraguay"); System.out.println("Pais de Origen Actualizado: " + pf1.getPaisDeOrigen());;
        
        //Mostrar nombre y precio del producto mas caro
        Productos[] inventario = new Productos[6];
        inventario[0] = pr1;
        inventario[1] = pr2;
        inventario[2] = pc1;
        inventario[3] = pc2;
        inventario[4] = pf1;
        inventario[5] = pf2;
        float precio = 0;
        float total = 0;
        int contador = 0;
        String nombre = "";
        for(int i=0; i < inventario.length; i++){
            Productos index = new Productos();
            if(precio < inventario[i].getPrecio()){
                precio = inventario[i].getPrecio();
                nombre = inventario[i].getNombre();
                
                total += precio;
                contador++;
            }
        }
        
        System.out.println("\nEl producto mas caro del inventario es: " + nombre + "\nCon un precio de: $" + precio);
        System.out.println("El precio promedio de los productos es de: " + total/contador);
    }
}
