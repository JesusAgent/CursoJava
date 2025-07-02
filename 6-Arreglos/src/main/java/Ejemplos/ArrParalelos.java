/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author ztwen
 */
public class ArrParalelos {
    public static void main(String[] args) {
        
        String[] codigos = {"TG0987", "ML029", "MS8771", "UK1025", "DD8543", "AVX2014", "TW005"};
        String[] productos = {"Teclado Genius", "Mouse Logitech", "Monitor Samsung 22\"", "USB Kingston 128GB", "Disco Duro Western", "Audífonos VX500", "Tableta Wacom S"};
        double[] precios = {156.50, 45.00, 420.00, 54.50, 284.65, 210.60, 230.50};
 
        
        String separador = String.format("%44s", "").replace(" ", "-");
 
        System.out.printf("\n%1$s\ncatalogo de productos\n%1$s\n", separador);
 
        
        for(int i = 0; i < codigos.length; i++) {
            System.out.printf("%-10s%-24s%9.2f\n", codigos[i], productos[i], precios[i]);
        }
 
        System.out.println(separador);
    
    }
}
