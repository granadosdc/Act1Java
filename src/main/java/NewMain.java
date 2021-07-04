
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cielo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese su nombre de usuario\n");
    String usuario = scanner.nextLine();
    System.out.println("Ingrese su apellido\n");
    String apellido = scanner.nextLine();
    System.out.println("Hola "+ usuario + apellido);
    System.out.println("Ingresa tu edad\n");
    String edad = scanner.nextLine();
    System.out.println("Ingrese un número");
    System.out.println("Queremos conocer más de ti, cúal es tu hobbie?\n");
    String hobbie = scanner.nextLine();    
    System.out.println("Comentanos, cuál es tu editor de código preferido?\n");
    String preferido = scanner.nextLine();
    System.out.println("Por último; quisieramos saber: cúal sistema operativo utiliza?\n");
    String utiliza = scanner.nextLine();
    
    System.out.println("Gracias por confiarnos tus preferencias");
    
    System.out.println("Ahora sabemos que tu nombre y apellido es: "+usuario+" "+apellido);
    System.out.println("tu edad es: "+edad+" años");
    System.out.println("tu hoobie es: "+hobbie); 
    System.out.println("y el sistema operativo que usas es: "+utiliza);
    
    }
    
}
