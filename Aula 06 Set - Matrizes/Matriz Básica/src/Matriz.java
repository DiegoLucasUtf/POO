import java.util.Random;

public class Matriz {
    public static void Preenchimento (int[][] mat, int end) {

        int numLinhas = mat.length, numColunas = mat[0].length;         // Pega a quantidade de linhas e colunas da matriz

        Random r = new Random();                

        for ( int i = 0; i < numLinhas; i++ ) {

            for ( int j = 0; j < numColunas; j++ ) {

                mat[i][j] =  r.nextInt(end);            // Preenche a Matriz com números aleatórios

            }

        }

    }

    public static void ImprimeMatriz (int[][] mat) {

        for ( int i = 0; i < mat.length; i++ ) {

            if ( i == 0 ) {

                System.out.println( "---------------------");

            }

            for ( int j = 0; j < mat[0].length; j++ ) {

                if ( j == 0 ) {

                    System.out.printf( "| %d |", mat[i][j] );

                } else {

                    System.out.printf( " %d ", mat[i][j] );

                    System.out.printf( "|");

                }

            }

            System.out.printf( "\n");
            System.out.println( "---------------------");

        }

    }

    public static void main (String[] args) throws Exception {

        int l = 5, c = 5;

        int [][] matriz_A = new int[l][c], matriz_B = new int[l][c];        // Declara as matrizes
        
        Preenchimento ( matriz_A, 10 );
        Preenchimento ( matriz_B, 10 );

        System.out.printf( "\nMatriz A: \n");
        ImprimeMatriz(matriz_A);

        System.out.printf( "\n\nMatriz B: \n");

        ImprimeMatriz(matriz_B);

    }
}
