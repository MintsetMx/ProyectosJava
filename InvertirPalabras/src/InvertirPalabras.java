
import java.util.Scanner;


public class InvertirPalabras {

    public static void main(String[] args) {
     
        Scanner escaner = new Scanner(System.in);
        String palabra;
        String invertir = " ";
        
        System.out.print("Ingresa una palabra: ");
        palabra = escaner.nextLine();
        
        for(int contador = palabra.length()-1; contador >= 0; contador --){
            invertir += palabra.charAt(contador);
        }
        
        System.out.println(invertir);
    }
    
}
