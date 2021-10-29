package algoritmos;

import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        // 1. Generar N lanzamientos aleatorios
	// 2. Guardar los valores de cada lanzamiento en una lista	
        // 3. Imprimir los valores
        // 4. Imprimir la suma 
        Random random = new Random();
        int suma = 0;  
        // 1. Generar N lanzamientos aleatorios
        int cantLanzamientos = random.nextInt(10) + 10;
        System.out.println("Cantidad de Lanzaminentos: " + cantLanzamientos);
        int valores[] = new int[cantLanzamientos];
        // 2. Guardar los valores de cada lanzamiento en una lista
        for (int i=0; i<cantLanzamientos ; i++){
            // Guardo en la variable dado, los valores aleatorios del 1 al 6
            int dado = random.nextInt(6) + 1;
            valores[i] = dado;            
        }
        System.out.println("Los valores son:");  
        // 3. Imprimir los valores
        for (int k=0 ; k < valores.length ; k++){
            suma += valores[k];  // suma = suma + valores[k]
            System.out.print(valores[k] + "\t");
        }
        // 4. Imprimir la suma         
        System.out.println("\n" + "La suma de los valores son: " + suma);
    }
}
