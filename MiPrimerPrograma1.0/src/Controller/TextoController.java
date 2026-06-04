import java.util.Scanner;

//Hecho por: Joaquin Sanchez
//carne: 2026117
//grado: IN4CM

public class TextoController {

    // 11. Concatenador de Nombre
    public void concatenarNombre(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println(">> Nombre completo: " + nombre + " " + apellido);
        
    }
    
    
}