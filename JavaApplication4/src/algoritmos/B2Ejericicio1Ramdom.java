package algoritmos;

import java.util.Scanner;

public class B2Ejericicio1Ramdom {

	public static void main(String[] args) {
		// TODO code application logic here
		Scanner lectura = new Scanner(System.in);
		int n = (int) (Math.random() * 99 + 10);
		System.out.println("La cant. nros:" + n + "\t");
		int nro[] = new int[n];
		for (int i = 0; i < n; i++) {
			nro[i] = i + 1;
		}
		for (int j = 0; j < nro.length; j++) {
			System.out.print(nro[j] + "\t");
		}

		lectura.close();
	}

}
