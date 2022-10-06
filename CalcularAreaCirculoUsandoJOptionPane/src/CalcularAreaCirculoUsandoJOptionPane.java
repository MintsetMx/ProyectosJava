
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author MrDan
 */
public class CalcularAreaCirculoUsandoJOptionPane {


    public static void main(String[] args) {
        
        String texto = JOptionPane.showInputDialog("Introduce un radio");
        
        //pasamos el string a double
        
        double radio=Double.parseDouble(texto);
        
        //formula area del circulo, usando metodos de Math
        
        double area= Math.PI*Math.pow(radio, 2);
        
        //Mostramos el resultado
        System.out.println("El area del circulo es "+area);
    }
    
}
