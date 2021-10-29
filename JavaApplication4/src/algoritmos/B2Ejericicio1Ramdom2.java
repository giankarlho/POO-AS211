package algoritmos;

import java.util.Random;
import java.util.Scanner;

public class B2Ejericicio1Ramdom2 {

	public static void main(String[] args) {
		// TODO code application logic here
		// Guarde e Imprima los N primeros números naturales con arreglos
		Random ingreso = new Random();
		int cantNros = ingreso.nextInt(99) + 10;
		System.out.println("La cant. nros:" + cantNros + "\t");
		int nros[] = new int[cantNros];
		// Guardando los valores a la lista de nros[]
		for (int i = 0; i < cantNros; i++) {
			nros[i] = i + 1;
		}
		// Imprimir los valores de la lista nros[]
		for (int j = 0; j < nros.length; j++) {
			System.out.print(nros[j] + "\t");
		}

	}

}
