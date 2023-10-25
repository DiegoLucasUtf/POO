public class Conta {
    
    private String titular;
    private int numero;
    private double saldo;

    public Conta ( String titular ) {

        this.titular = titular;

    }

    // Métodos de Get, para acessar os valores privados
    public String getTitular() {

        return this.titular;

    }

    public int getNumero() {

        return this.numero;

    }

    public double getSaldo() {

        return this.saldo;

    }


    // Métodos de Set, para atribuir valores aos atributos privados
    public void setTitular ( String titular ) {

        this.titular = titular;

    }

    public void setNumero ( int numero ) {

        if ( numero > 0 ) {

            this.numero = numero;

        }

    }

    public void setSaldo ( double saldo ) {

        if ( saldo >= 0 ) {

            this.saldo = saldo;

        }

    }


    // Método que imprime os valores
    public String asString () {

        return String.format( "\n\nTitular: %s\nNumero: %d\nSaldo: %.2f ", titular, numero, saldo );

    }


    // Método para o cliente realizar um saque
    public boolean sacar ( double valor ) {

        if ( valor <= saldo ) {

            saldo -= valor;
            return true;

        } else {

            return false;

        }

    }

}
