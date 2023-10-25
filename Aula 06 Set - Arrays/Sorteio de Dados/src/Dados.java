import java.util.Random;

public class Dados {
    public static void main(String[] args) throws Exception {

        Random r = new Random();
        
        int numLados = 6, numVezes = 1000, resultado = 0;   
        int[] cont = new int[numLados];

        for ( int i = 0; i < numVezes; i++ ) {

            resultado = r.nextInt(numLados) + 1;

            cont [resultado - 1] += 1;

        }

        for ( int i = 0; i < numLados; i++ ) {

            System.out.printf("%d\t%d\n", i + 1, cont[i] );

        }
    }
}
