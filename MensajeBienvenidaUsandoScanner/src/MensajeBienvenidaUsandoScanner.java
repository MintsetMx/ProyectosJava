
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author MrDan
 */
public class MensajeBienvenidaUsandoScanner {


    public static void main(String[] args) {
        
        //Mostramos la entrada de datos del Scanner
        Scanner sc = new Scanner(System.in);
        
        //Introducimos el nombre
        System.out.println("Introduce tu nombre");
        String nombre=sc.nextLine();
        
        //Mostramos el saludo mas el nombre incluido
        System.out.println("Bienvenido "+nombre);   
    }
    
}
