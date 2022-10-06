/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author MrDan
 */
public class MayorQue {


    public static void main(String[] args) {
        
        //Declaramos e iniciamos las variables
        int num1 = 10;
        int num2 = 100;
        
        //Hacemos la comparacion de Mayor e igual (podemos cambiar el valor de las variables para ver su funcionamiento)
        if (num1>=num2){
            //Anidamos otro if para la siguiente comparacion, donde comparamos que los valores sean iguales
            if(num1==num2){
                System.out.println("Los numeros " +num1+ " y " +num2+ " son iguales");
            }else{
                System.out.println("El numero " +num1+ " es mayor que el numero " +num2);
            }
        } else{
            System.out.println("El numero " +num2+ " es mayor que el numero " +num1);
        }
    }
    
}
