/*
Se requiere saber si 3 números enteros ingresados se encuentran o no en progresión aritmética, 
Las variables leídas son: n1, n2 y n3.
 */

import java.util.Scanner;  
  
public class Ejercicio1 {  
    public static void main(String[] args) {  
          
        Scanner leer = new Scanner (System.in);  
          
        System.out.println("PROGRESION ARITMETICA DE 3 NUMEROS");  
        System.out.println("==================================");  
        System.out.println("ingrese el primer numero --> ");  
        int a= leer.nextInt();  
        System.out.println("ingrese el primer numero --> ");  
        int b= leer.nextInt();  
        System.out.println("ingrese el primer numero --> ");  
        int c= leer.nextInt();  
          
        if(b-a == c-b)  
            System.out.println("estan en progresiona aritmetica...");  
        else   
            System.out.println("no estan en PA...");  
    }  
}