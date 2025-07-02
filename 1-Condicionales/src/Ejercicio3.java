/*
Una persona se puede jubilar si tiene 65 años o más en el caso de los hombres, y 60 como mínimo, 
en el caso de las mujeres. Las variables leídas son: sexo y edad. Determinar si la persona puede jubilarse.
 */

import java.util.Scanner;  
  
public class Ejercicio3 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        // Solicitar sexo  
        System.out.println("ingrese su sexo (M para hombre, F para mujer): ");  
        char sexo = scanner.next().toUpperCase().charAt(0);  
  
        // Solicitar edad  
        System.out.println("ingrese su edad: ");  
        int edad = scanner.nextInt();  
  
        // Determinar si puede jubilarse  
        if (sexo == 'M') {  
            if (edad >= 65) {  
                System.out.println("usted puede jubilarse");  
            } else {  
                System.out.println("usted no puede jubilarse todavía");  
            }  
        } else if (sexo == 'F') {  
            if (edad >= 60) {  
                System.out.println("usted puede jubilarse");  
            } else {  
                System.out.println("usted no puede jubilarse todavía");  
            }  
        } else {  
            System.out.println("sexo ingresado no valido");  
        }   
    }  
}
