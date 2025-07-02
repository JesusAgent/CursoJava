/*
Una tienda acepta cambio de productos en los siguientes casos: si el producto  
tiene un precio entre 50 y 80 soles y fue comprado el día lunes (día 1) o si el  
producto tiene un precio no por debajo de 120 soles y fue comprado cualquier  
día, excepto miércoles o jueves (días 3 o 4, respectivamente). Evaluar si  
procede o no el cambio del producto. Las variables leídas son precioProducto  
y numeroDia.
 */

import java.util.Scanner;  
  
public class Ejercicio4 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
  
        System.out.println("ingrese el precio del producto: ");  
        double precioProducto = scanner.nextDouble();  
  
  
        System.out.println("ingrese el numero del dia de la compra (1 para lunes, 2 para martes, ..., 7 para domingo): ");  
        int numeroDia = scanner.nextInt();  
  
        // Evaluar si procede el cambio del producto  
        boolean cambioProcede = false;  
  
        // Condición 1: Precio entre 50 y 80 soles, comprado el día lunes (día 1)  
        if (precioProducto >= 50 && precioProducto <= 80 && numeroDia == 1) {  
            cambioProcede = true;  
        }  
        // Condición 2: Precio no por debajo de 120 soles, comprado cualquier día excepto miércoles o jueves  
        else if (precioProducto >= 120 && (numeroDia != 3 && numeroDia != 4)) {  
            cambioProcede = true;  
        }  
  
  
        if (cambioProcede) {  
            System.out.println("el cambio del producto procede.");  
        } else {  
            System.out.println("el cambio del producto no procede.");  
        }   
    }  
}