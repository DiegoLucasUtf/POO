public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario ( String nome, String cpf, double salario ) {

        this.setNome( nome );
        this.setCpf( cpf );
        this.setSalario( salario );

    }

    // Getters
    public String getNome () {

        return nome;

    }

    public String getCpf () {

        return cpf;

    }

    public double getSalario () {

        return salario;

    }

    // Setters
    public void setNome ( String nome ) {

        this.nome = nome;

    }

    public void setCpf ( String cpf ) {

        this.cpf = cpf;

    }

    public void setSalario ( double salario ) {

        this.salario = salario > 0 ? salario : 0;

    }

    public void reajustarSalario ( double percentual ) {

        double reajuste = salario * percentual;

        if ( percentual >= 0 ) {

            salario += reajuste;

        } else {

            salario -= reajuste;

        }
        

    }

    @Override
    public String toString () {

        return String.format ( "%s, %s, %.2f", nome, cpf, salario );

    }
    
}
