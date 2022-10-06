
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author MrDan
 */
public class CalcularAreaCirculoUsandoScanner {

    public static void main(String[] args) {
        
        //creamos el scanner
        Scanner sc = new Scanner(System.in);
        //ingresamos el radio del circulo, usamos la constante PI y el metodo pow de Math
        System.out.println("Introduce el radio");
        sc.useLocale(Locale.US);
        double radio = sc.nextDouble();
        
        //formula area del circulo, usamos algunos metodos de Math
        double area = Math.PI*Math.pow(radio, 2);
        
        System.out.println("El area del circulo es "+area);
        
    }
    
}
