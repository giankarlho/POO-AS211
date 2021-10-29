package algoritmos;

public class B2EjercicioPares {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int contador = 0;
        for (int a=0; a<=3; a++) {            
            for (int b=0; b<=3; b++){
                matriz[a][b] = contador;
                contador += 2;
            }
        }

        // El 1er for representa las filas
        for (int i = 0; i <= 3; i++) {
            // El 2do. for representa las columnas
            for (int j = 0; j <= 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
