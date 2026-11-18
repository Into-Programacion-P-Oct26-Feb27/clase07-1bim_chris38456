/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo022 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int limite;
        int contador = 1;
        int sumaPares = 0;
        int multiplicacionImpares = 1; // Debe iniciar en 1 para multiplicar
        
        System.out.println("Ingrese el Límite"); 
        limite = entrada.nextInt(); // Ejemplo: 6
        
        while (contador <= limite) {
            if (contador % 2 == 0) {
                // Si el residuo es 0, el número es par
                sumaPares = sumaPares + contador;
            } else {
                // Si no es par, es impar
                multiplicacionImpares = multiplicacionImpares * contador;
            }
            contador = contador + 1;
        }
        
        System.out.printf("La suma de pares es: %d\n", sumaPares);
        System.out.printf("La multiplicación de impares es: %d\n", multiplicacionImpares);
    }
}
/*

*/