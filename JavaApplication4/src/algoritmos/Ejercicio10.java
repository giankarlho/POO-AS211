package algoritmos;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		Una tienda hace un descuento de $10 si el total de compra es mayor a $500.
		Deberás calcular el precio a pagar, basado en el valor de la compra.
		*/
		Scanner ingreso = new Scanner(System.in);	
		System.out.println("Ing. el valor de compra");
		double compra = ingreso.nextDouble();
		double precio = 0.0;
		if (compra > 500) {
			precio = compra - 10;
		} else {
			precio = compra;
		}
	}	

}
