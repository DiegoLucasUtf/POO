public class AppContaSobrecarga {
    public static void main(String[] args) throws Exception {
        
        // Cria um objeto chamado conta com o titular de valor "Diego Dallaqua"
        ContaSobrecarga contaDi = new ContaSobrecarga( "Diego Dallaqua");

        // As duas linhas abaixo não funcionam com atributos privados
        /*conta.numero = 12345;
        conta.saldo = 10000;*/

        // Usa os Sets pra pegar os valores
        contaDi.setNumero( 12345 );
        contaDi.setSaldo( 5000 );

        // Mostra os valores do Titular, do Numero da Conta e do Saldo
        System.out.println ( contaDi.asString() );

        // Cria a variável mensagem e a variável saque
        String msg;
        double saque = 2000;

        if ( contaDi.sacar ( saque ) ) {

            msg = String.format("\n\nSaque de %.2f realizado com sucesso!\nSaldo Atual: %.2f", saque, contaDi.getSaldo() );

        } else {

            msg = String.format( "Impossível de sacar o valor de: %.2f.\nSaldo atual: %.2f", saque, contaDi.getSaldo() );

        }

        System.out.println(msg);

        // Mostra os valores do Titular, do Numero da Conta e do Saldo
        System.out.println ( contaDi.asString() );


    // Parte de Sobrecarga de Métodos

        // Cria um 2º Objeto utilizando outro construtor
        ContaSobrecarga contaPri = new ContaSobrecarga("Priscila Dallaqua", 5678910 );
        contaPri.setSaldo(10000);

        // Mostra os valores do Titular, do Numero da Conta e do Saldo
        System.out.println ( contaPri.asString() );


        // Cria um 3º Objeto utilizando outro construtor e Mostra os valores do Titular, do Numero da Conta e do Saldo
        ContaSobrecarga contaGuh = new ContaSobrecarga("Gustavo Dallaqua", 123456789, 15000);
        System.out.println ( contaGuh.asString() );

        System.out.println ( "\nTotal de Contas: " + ContaSobrecarga.getTotalDeContas() );

    }

}
