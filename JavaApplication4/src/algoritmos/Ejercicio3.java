package algoritmos;

import java.util.Scanner;

// Ejercicio 3
public class Ejercicio3 {

	public static void main(String[] args) {
		// Lee dos números e imprime cuál de ellos es mayor o bien si son iguales.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ing. el nro. 1");
		int nro1 = entrada.nextInt();
		System.out.println("Ing. el nro. 2");
		int nro2 = entrada.nextInt();
		if (nro1 > nro2) {
			System.out.println("El nro1 es mayor");
		} else if (nro2 > nro1) {
			System.out.println("El nro2 es mayor");
		} else {
			System.out.println("Los dos nros. son iguales");
		}

	}

}
