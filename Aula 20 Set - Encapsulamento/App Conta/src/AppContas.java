public class AppContas {
    public static void main(String[] args) throws Exception {
        
        // Cria um objeto chamado conta com o titular de valor "Diego Dallaqua"
        Conta conta = new Conta( "Diego Dallaqua");

        // As duas linhas abaixo não funcionam com atributos privados
        /*conta.numero = 12345;
        conta.saldo = 10000;*/

        // Usa os Sets pra pegar os valores
        conta.setNumero( 12345 );
        conta.setSaldo( 5000 );

        // Mostra os valores do Titular, do Numero da Conta e do Saldo
        System.out.println ( conta.asString() );

        // Cria a variável mensagem e a variável saque
        String msg;
        double saque = 2000;

        if ( conta.sacar ( saque ) ) {

            msg = String.format("\n\nSaque de %.2f realizado com sucesso!\nSaldo Atual: %.2f", saque, conta.getSaldo() );

        } else {

            msg = String.format( "Impossível de sacar o valor de: %.2f.\nSaldo atual: %.2f", saque, conta.getSaldo() );

        }

        System.out.println(msg);

        // Mostra os valores do Titular, do Numero da Conta e do Saldo
        System.out.println ( conta.asString() );

    }

}
