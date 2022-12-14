/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Usuario iTC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numerador;
        int[] multiplicacion = {1, 2, 3, 4};

        System.out.println("N°" + "\t" + "x2" + "\t" + "x3" + "\t" + "x4");
        for (numerador = 25; numerador > 0; numerador--) {
            

            System.out.println(numerador * multiplicacion[0] + "\t" + numerador
                    * multiplicacion[1] + "\t" + numerador * multiplicacion[2]
                    + "\t" + numerador * multiplicacion[3] + "\t");
        }
    }

}
