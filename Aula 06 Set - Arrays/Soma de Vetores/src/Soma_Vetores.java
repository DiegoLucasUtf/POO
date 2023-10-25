import java.util.Random;

public class Soma_Vetores {
    public static void main(String[] args) throws Exception {
        
        int n = 10;
        Random r = new Random();

        int [] a = new int[10], soma = new int[n];

        // Inicializando
        for( int i = 0; i < n; i++ ) {

            a[i] = r.nextInt(100);          // Sorteia um número de 0 a 100

            if ( i == 0 ) {

                soma[i] = a[i];             // Caso for o primeiro número do vetor, a soma vai ser igual a ele mesmo

            } else {

                soma[i] = a[i] + soma[ i - 1 ];        // Soma um elemento do vetor A com o seu antecessor

            }

        }

        for( int i = 0; i < soma.length; i++ ) {

            System.out.printf( "%d: (Novo Número = %d, Soma = %d)\n", i, a[i], soma[i] );

        }

    }
}
