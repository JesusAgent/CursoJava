/*
Convertir monedas 
 */

package Ejercicios;

import java.util.Scanner;  
  
public class Ej2_ConvertirMonedas {  
    public static void main(String[] args) {  
          
        Scanner leer = new Scanner(System.in);  
          
        System.out.println("ingrese la moneda a convertir (s) soles, (d) dolares, (e) euros: ");  
        char moneda = leer.next().charAt(0);  
          
        double monto, cambio = 0.0;  
        
          
        switch (moneda) {  
            case 's','S': System.out.println("ingrese el monto: ");  
                    monto = leer.nextFloat();  
                    System.out.println("converit [d] soles o [e] euros: ");  
                    char conv = leer.next().charAt(0);  
                    switch (conv) {  
                        case 'd': cambio = monto/3.82;  
                        break;  
                        case 'e': cambio = monto/4.17;  
                        break;  
                    }    
                    break;   
                      
            case 'd','D': System.out.println("ingrese el monto: ");  
                    monto = leer.nextFloat();  
                    System.out.println("converit [d] soles o [e] euros: ");  
                    conv = leer.next().charAt(0);  
                    switch (conv) {  
                        case 'd': cambio = monto*3.82;  
                        break;  
                        case 'e': cambio = monto/4.17;  
                        break;  
                    }    
                    break;  
  
            case 'e','E': System.out.println("ingrese el monto: ");  
                    monto = leer.nextFloat();  
                    System.out.println("converit [d] soles o [e] euros: ");  
                    conv = leer.next().charAt(0);  
                    switch (conv) {  
                        case 'd': cambio = monto*3.82;  
                        break;  
                        case 'e': cambio = monto*1.09;  
                        break;  
                    }    
                    break;  
                      
                      
   
        }  
        System.out.println("el tipo de cambio es: " + cambio);  
    }  
}