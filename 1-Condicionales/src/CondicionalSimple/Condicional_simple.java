/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CondicionalSimple;

/**
 *
 * @author ztwen
 */
public class Condicional_simple {  
    public static void main(String[] args) {  
          
        float precioProducto = 2000f;  
        int unidadesCompradas = 6;  
          
        // el || sirve como or y && como AND //  
        boolean aplicaDescuento = (unidadesCompradas > 5) || (precioProducto * unidadesCompradas > 2000.0);  
          
        if (aplicaDescuento) {  
            System.out.println("enhorabuena, tiene 10% de descuento");  
        }   
          
        else {  
            System.out.println("gracias por su compra");          
        }  
    }   
}