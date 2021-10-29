package algoritmos;

import java.util.Scanner;



public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);	
		System.out.println("Ing. el valor de compra");
		double compra = ingreso.nextDouble();
		double precio = 0.0;
		if (compra >= 100 & compra <= 200) {
			precio = compra - 10;
		} else if (compra > 200) {
			precio = compra - 20;
		} else {
			precio = compra;
		}
		System.out.println("El precio es " + precio);
	}

}
