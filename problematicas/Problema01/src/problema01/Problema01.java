/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuario iTC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre_jugador;
        String posicion_jugador;
        String cadena = "";
        int edad_jugador;
        int numerador = 1;
        double estatura_jugador;
        double promedioedades = 0;
        double promedioestaturas = 0;
        String listado = "";
        String numeracion = "";

        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Ingrese el nombre del jugador");
            nombre_jugador = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion_jugador = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad_jugador = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura_jugador = entrada.nextDouble();

            entrada.nextLine(); //limpieza del buffer

            cadena = String.format("%s%d.%s-%s-,edad %d,estatura %.2f\n",
                    cadena, numerador, nombre_jugador,
                    posicion_jugador, edad_jugador,
                    estatura_jugador);

            numerador = numerador + 1;

            promedioedades = promedioedades + edad_jugador / 5;

            promedioestaturas = promedioestaturas + estatura_jugador / 5;

            listado = String.format("%s %d", listado,
                    edad_jugador);
        }

        System.out.printf("Listado de Jugadores\n%sListado Edades"
                + "%s\tPromedio edades %.2f\tPromedio estauras %.2f", cadena,
                listado, promedioedades, promedioestaturas);
    }

}
