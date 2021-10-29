package algoritmos;

public class B2Ejercicio32 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];        
        for (int a=0; a<=3; a++) {            
            for (int b=0; b<=3; b++){
                if (a==b){
                    matriz[a][b]=1;
                }else{
                    matriz[a][b]=0;
                }
            }
        }

        // El 1er for representa las columnas
        for (int i = 0; i <= 3; i++) {
            // El 2do. for representa las filas
            for (int j = 0; j <= 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
