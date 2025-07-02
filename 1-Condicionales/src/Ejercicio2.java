/*
Pedir al usuario un codigo universitario valido
 */

import java.util.Scanner;  
  
public class Ejercicio2 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        String codePattern = "^U\\d{8}$"; // Patrón: U seguido de 8 dígitos  
        String userCode;  
  
        while (true) {  
            System.out.print("Ingrese el codigo universitario (ejemplo: U23205077): ");  
            userCode = scanner.nextLine();  
  
            if (userCode.matches(codePattern)) {  
                System.out.println("Codigo valido. ");  
                break; // Salir del bucle si el código es válido  
            } else {  
                System.out.println("Formato incorrecto. Intente nuevamente.");  
            }  
        }  
    }  
}