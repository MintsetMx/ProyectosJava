
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author MrDan
 */
public class NumeroDivisibleEntreDos {


    public static void main(String[] args) {
        
        //creamos el scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        
        //comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
        
        if(numero%2==0){
            System.out.println("El numero "+numero+" es divisible entre 2");
        }else{
            System.out.println("El numero "+numero+" no es divisible entre 2");
        }
        
    }
    
}
