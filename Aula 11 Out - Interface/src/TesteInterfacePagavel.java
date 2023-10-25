package TesteInterfacePagavel;

public class TesteInterfacePagavel {

    public static void processaPagaveis ( Pagavel[], pagaveis ) {
        
        for ( Pagavel pagavelAtual : pagaveis ) {
            
            System.out.printf( "%s\nPagamento: RS%,.2f\n\n", pagavelAtual, pagavelAtual.GetValorPagamento() );

        }

    }

    public static void main(String[] args) throws Exception {

        Pagavel[] pagaveis = new Pagavel [2];
        pagaveis[0] = new Recibo( "1", "Pastilha de Freio", 2, 3500.00 );
        pagaveis[1] = new Recibo( "2", "Pneu aro 13", 4, 329.99 );
        pagaveis[2] = new EmpregadoAssalariado ( "João", "Silva", "12345-66", 4000.00 );
        pagaveis[3] = new EmpregadoAssalariado ( "Roberta", "Cunha", "98765-00", 2400.00 );
        
        processaPagaveis( pagaveis );

    }

}
