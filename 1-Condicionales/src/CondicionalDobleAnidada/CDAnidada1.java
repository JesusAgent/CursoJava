/* Escribir un programa que solicite un número entero y determine si es positivo, negativo o cero.
*/

package CondicionalDobleAnidada;

import java.util.Scanner;  
 
public class CDAnidada1 {  
    public static void main(String[] args) {  
          
        Scanner leer = new Scanner(System.in);  
          
        System.out.println("ingrese un numero entero ");  
        int num = leer.nextInt();  
          
        if(num>0) {  
            System.out.println("el numero es positivo...");  
        }  
        else{  
            if(num == 0)  
                System.out.println("es neutro...");  
            else   
                System.out.println("es negativo");  
		
        }  
    }  
}