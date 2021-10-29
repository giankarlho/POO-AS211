package algoritmos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		Diseñar un algoritmo que pida por teclado tres números; 
		si el primero es negativo, debe imprimir el producto de los tres 
		y si no lo es,  imprimirá la suma.
		*/
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ing. nro1");
		int nro1 = ingreso.nextInt();
		System.out.println("Ing. nro2");
		int nro2 = ingreso.nextInt();
		System.out.println("Ing. nro3");
		int nro3 = ingreso.nextInt();
		if (nro1 <0) {
			System.out.println("El producto es: " + nro1*nro2*nro3);
		} else 
			System.out.println("La suma es: " + (nro1+nro2+nro3));		
	}

}
