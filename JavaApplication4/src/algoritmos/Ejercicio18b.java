
package algoritmos;

import java.util.Scanner;

public class Ejercicio18b {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresa los N numeros");
        int numero = ingreso.nextInt();
        System.out.println("La suma es" + numero * (numero + 1) / 2);
    }

}        

