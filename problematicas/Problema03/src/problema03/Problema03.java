/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Usuario iTC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena = "";
        double contador;
        double formula;
        double valor1 = 5;
        double valor2 = 9;
        

        for (contador = 20; contador < 84; contador += 4) {
            
            formula = (valor1 / valor2) * (contador - 32);
            
            cadena = String.format("%s %.0f °F = %.2f °C\n",
                    cadena,contador, formula);

        }
        System.out.println(cadena);

    }
}

