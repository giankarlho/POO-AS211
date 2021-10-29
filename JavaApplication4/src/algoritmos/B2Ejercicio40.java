package algoritmos;

/*
Generar y simular el lanzamiento de un dado
y guardar en una matriz de NxM donde N y M sean de dos cifras y determinar:
¿Cuántas lanzadas sacaron 6?
¿Cuántos pares hay en la matriz?
¿Qué fila tiene la mayor suma?
 */

public class B2Ejercicio40 {

    public static void main(String[] args) {
        int cantSeis = 0, cantPares = 0, sumaValorPorFila=0, indiceFila=0;
        int FILAS = (int) (Math.random() * 10 + 5);
        System.out.println("Son " + FILAS + " filas");
        int COLUMNAS = (int) (Math.random() * 10 + 5);
        System.out.println("Son " + COLUMNAS + " columnas");
        int lanzamientos[][] = new int[FILAS][COLUMNAS]; // Arreglo bidimensional
        for (int r = 0; r <= FILAS - 1; r++) {
            int sumaTemp = 0;
            for (int s = 0; s <= COLUMNAS - 1; s++) {                
                lanzamientos[r][s] = (int) (Math.random() * 6 + 1);
                // 1. Comparar si el lanzamientos es igual 6 y aumentar la cantidad de nros. seis
                if (lanzamientos[r][s] == 6) {
                    cantSeis++; // cantSeis = cantSeis + 1
                }
                // 2. Hallar la cantidad de lanzamientos pares
                if (lanzamientos[r][s] % 2 == 0) {
                    cantPares++; // cantPares +=1  o cantPares = cantPares + 1
                }
                sumaTemp += lanzamientos[r][s]; // sumaTemp = sumaTemp + lanzamientos[r][s]
            }
            if (sumaTemp > sumaValorPorFila ){
                sumaValorPorFila = sumaTemp;
                indiceFila = r;
            }
        }

        // Para Imprimir
        for (int r = 0; r <= FILAS - 1; r++) {
            for (int s = 0; s <= COLUMNAS - 1; s++) {
                System.out.print(lanzamientos[r][s] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("La cantidad de veces que salió el nro. 6 es: " + cantSeis);
        System.out.println("La cantidad de lanzamientos pares es: " + cantPares);
        System.out.println("La fila " + indiceFila + " tiene la mayor suma y es: " + sumaValorPorFila);
    }

}
