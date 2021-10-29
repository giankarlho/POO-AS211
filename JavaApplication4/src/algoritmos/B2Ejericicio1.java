package algoritmos;

import java.util.Scanner;

public class B2Ejericicio1 {

	public static void main(String[] args) {
		// Guarde e Imprima los N primeros números naturales con arreglos
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ing. la cantidad de nros. ");
		int cantNros = ingreso.nextInt();		
		int nros[] = new int[cantNros];
		// Guardando los valores a la lista de nros[]
		for (int i=0 ; i < cantNros ; i++) {
			nros[i] = i + 1;
		}
		// Imprimir los valores de la lista nros[]
		for (int j=0 ; j < nros.length ; j++) {
			System.out.print(nros[j] + "\t");
		}
		ingreso.close();
	}

}
