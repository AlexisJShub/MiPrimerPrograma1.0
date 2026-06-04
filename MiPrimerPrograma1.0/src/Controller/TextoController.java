package Controller;
import java.util.Scanner;

//Hecho por: Joaquin Sanchez
//carne: 2026117
//grado: IN4CM
//

public class TextoController {

    // 11. Concatenador de Nombre
    public void concatenarNombre(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println(">> Nombre completo: " + nombre + " " + apellido);
        
    }
    
    // 12. Contador de Longitud
    public void contarLetras(Scanner scanner) {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        System.out.println(">> La palabra '" + palabra + "' tiene " + palabra.length() + " letras.");
    }
    
    // 13. Inversor de Texto
    public void invertirTexto(Scanner scanner) {
        System.out.print("Ingrese una palabra para invertir: ");
        String palabra = scanner.nextLine();
        String invertida = new StringBuilder(palabra).reverse().toString();
        System.out.println(">> Resultado: " + invertida);
    
    
    }
    
}