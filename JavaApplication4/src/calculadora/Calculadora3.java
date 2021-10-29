package calculadora;

import java.util.Scanner;

public class Calculadora3 {
    
	public static void main(String[] args) {
		// Instanciando la clase "Scanner" en el objeto "ingreso"
		Scanner ingreso = new Scanner(System.in);

		System.out.println("Ing. el 1er. nro.");
		int nro1 = ingreso.nextInt();

		System.out.println("Ing. el operador");
		char operador = ingreso.next().charAt(0);

		System.out.println("Ing. el 2do. nro.");
		int nro2 = ingreso.nextInt();

		double resultado = 0.0;

		switch (operador) {
		case '+':
			resultado = nro1 + nro2;
			break;
		case '-':
			resultado = nro1 - nro2;
			break;
		case '*':
			resultado = nro1 * nro2;
			break;
		case '/':
			resultado = nro1 / nro2;
			break;
		case '%':
			resultado = nro1 % nro2;
			break;
		default:
			System.out.println("No haz ingresado el operador correcto");
		}
		System.out.println("El resultado es:" + resultado);

	}
   
}
