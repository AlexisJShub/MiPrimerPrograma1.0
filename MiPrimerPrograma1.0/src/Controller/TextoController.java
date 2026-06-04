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
    
    // 14. Detector de Vocales
    public void esVocal(Scanner scanner) {
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);
        scanner.nextLine();
        char c = Character.toLowerCase(caracter);
        boolean resultado = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
        System.out.println(">> ¿Es vocal?: " + resultado);
    }
    
    // 15. Extractor de Iniciales
    public void extraerIniciales(Scanner scanner) {
        System.out.print("Ingrese primer nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese primer apellido: ");
        String apellido = scanner.nextLine();
        if (!nombre.isEmpty() && !apellido.isEmpty()) {
            String iniciales = "" + nombre.charAt(0) + apellido.charAt(0);
            System.out.println(">> Iniciales: " + iniciales.toUpperCase());
        } else {
            System.out.println(">> Error: espacio vacíos.");
        
        }
  
        
    }
        
        // 16. Normalizador a Mayúsculas
    public void normalizarMayus(Scanner scanner) {
        System.out.print("Ingrese texto vareado: ");
        String texto = scanner.nextLine();
        System.out.println(">> Resultado: " + texto.toUpperCase());
    }
    
    // 17. Conversor Binario 
    public void conversorBinario(Scanner scanner) {
        System.out.print("Ingrese un texto de 0 y 1: ");
        String binario = scanner.nextLine();
        String resultado = (binario.length() % 2 == 0) ? "Par" : "Impar";
        System.out.println(">> La longitud es: " + resultado);
        
    }
   
// 18. Repetidor de Palabras
    public void repetirPalabra(Scanner scanner) {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        System.out.print("Ingrese la cantidad de repeticiones (N): ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print(">> Resultado: ");
        for (int i = 0; i < n; i++) {
            System.out.print(palabra + " ");
        }
        System.out.println(); 
    }
    
    // 19. Validador de contraseña
    public void validarContrasena(Scanner scanner) {
        System.out.print("Ingrese una contraseña: ");
        String password = scanner.nextLine();
        String estado = (password.length() > 8) ? "Segura" : "Insegura";
        System.out.println(">> La contraseña es: " + estado);
    }
    
    // 20. Generador de Email
    public void generarEmail(Scanner scanner) {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese plataforma (ej: plataforma.com): ");
        String dominio = scanner.nextLine();
        String email = nombre.toLowerCase() + "." + apellido.toLowerCase() + "@" + dominio.toLowerCase();
        System.out.println(">> Correo realizado y generando...: " + email);
    }
    
}
