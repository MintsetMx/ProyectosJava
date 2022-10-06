/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MillasAKm;

import java.util.Scanner;

/**
 *
 * @author MrDan
 */
public class MillasAKmMain {
    
    public static void main(String[] args) {
        
        /*Java printf para dar formato a los datos de salida
        Si queremos mostrar el número 12.3698 de tipo double con dos decimales:

        System.out.printf("%.2f %n", 12.3698);

        El primer % indica que en esa posición se va a escribir un valor. El valor a escribir se encuentra a continuación de las comillas.
        .2 indica el número de decimales.
        La f indica que el número es de tipo float o double.
        %n indica un salto de línea. Equivale a \n. Con printf podemos usar ambos para hacer un salto de línea.

        La salida por pantalla es:
        12,37
        
        Para mostrar el signo + en un número positivo:
        double n = 1.25036;
        System.out.printf("%+.3f %n", n);
        Salida:
        +1.250

        Si el número a mostrar es un entero se utiliza el caracter d:
        int x = 10;
        System.out.printf("%d %n", x);
        Salida:
        10

        Para mostrarlo con signo:
        int x = 10;
        System.out.printf("%+d %n", x);
        Salida:
        +10
        
        Para mostrar varias variables pondremos tantos % como valores vamos a mostrar. Las variables se escriben a continuación de las comillas separadas por comas:

        double n = 1.25036;
        int x = 10;
        System.out.printf("n = %.2f x = %d %n", n, x);
        Salida:
        n = 1,25 x = 10
        */
        
        //creamos las variables para el escaner, millas y kilometros
        Scanner sc = new Scanner(System.in);
        int millas;
        double km;
        System.out.println("Convertir Millas a Kilometros");
        
        do{
            System.out.println("Introduce millas (0 para finalizar): ");
            millas = sc.nextInt();
            
            if (millas !=0){
                km = millas * 1.6093;
                System.out.printf("%d millas equivalen a %.2f KM %n", millas, km);
            }
        }while(millas !=0);
        
    }
    
}
