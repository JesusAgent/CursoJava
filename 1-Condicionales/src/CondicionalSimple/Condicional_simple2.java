package CondicionalSimple;


import java.util.Scanner;  
  
public class Condicional_simple2 {  
    public static void main(String[] args) {  
          
        Scanner leer = new Scanner (System.in);  
          
        double monto;  
        String nombre;  
          
        System.out.println("ingrese el nombre del cliente: ");  
        nombre = leer.nextLine();  
        System.out.println("ingrese el monto de la compra" );  
        monto = leer.nextDouble();  
          
        double descuento = 0.0;  
        if (monto >= 2500) {  
            descuento = 0.10 * monto;     
        }  
          
        monto = monto - descuento;  
        System.out.println("descuento obtenido " + descuento);  
        System.out.println("el monto a pagar es " + monto);  
          
          
    }  
      
}