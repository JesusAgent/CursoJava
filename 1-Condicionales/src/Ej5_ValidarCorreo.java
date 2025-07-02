/*
Validar un correo electronico
 */


import java.util.Scanner;  
import java.util.regex.Matcher;  
import java.util.regex.Pattern;

public class Ej5_ValidarCorreo {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        String emailPattern = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"; // Patrón para validar correo electrónico  
        String correctPassword = "P@55w0rd";  
        int attempts = 0;  
        final int maxAttempts = 5;  
  
        while (attempts < maxAttempts) {  
            System.out.print("ingrese su direccion de correo: ");  
            String email = scanner.nextLine();  
  
            Pattern pattern = Pattern.compile(emailPattern);  
            Matcher matcher = pattern.matcher(email);  
  
            if (!matcher.matches()) {  
                System.out.println("formato de correo invalido. intente nuevamente.");  
                attempts++;  
                continue;  
            }  
  
            System.out.print("ingrese su clave de acceso: ");  
            String password = scanner.nextLine();  
  
            if (!password.equals(correctPassword)) {  
                System.out.println("clave incorrecta. Intente nuevamente.");  
                attempts++;  
                continue;  
            }  
  
            System.out.println("bienvenido al sistema");  
            scanner.close();  
            return;  
        }  
  
        System.out.println("cuenta suspendida");  
        scanner.close();  
    }  
}