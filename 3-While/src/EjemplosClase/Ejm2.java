package EjemplosClase;

import java.util.Scanner;  
  
public class Ejm2 {  
    public static void main(String[] args) {  
          
        Scanner leer = new Scanner(System.in);  
          
        int edad, suma;  
          
        System.out.println("ingrese la cantidad de alumnos ");  
        int n = leer.nextInt();  
          
        int c = 1;  
        suma = 0;  
          
          
        // x += 3 Equivalente a x = x + 3 //   
          
while(c <= n) {  
            System.out.println("ingrese la edad del alumno " +c+ " --> ");  
            edad = leer.nextInt();  
            suma+= edad;   
            c++;  
        }  
          
        double prom = suma*1.0/n;  
        System.out.println("el promedio es " + prom);  
  
    }  
}