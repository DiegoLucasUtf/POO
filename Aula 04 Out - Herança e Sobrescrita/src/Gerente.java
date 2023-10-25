public class Gerente extends Funcionario {

    private String senha;
    private int tempoNaEmpresa;

    // Construtores
    public Gerente ( String nome, String cpf, double salario ) {

        super ( nome, cpf, salario );

    }

    public Gerente ( String nome, String cpf, double salario, String senha, int tempoNaEmpresa ) {

        super ( nome, cpf, salario );

        setSenha ( senha );
        setTempoNaEmpresa ( tempoNaEmpresa );

    }

    // Getters
    public String getSenha () {

        return senha;

    }

    public int getTempoNaEmpresa () {

        return tempoNaEmpresa;

    }

    // Setters
    public void setSenha ( String senha ) {

        this.senha = senha;

    }

    public void setTempoNaEmpresa ( int tempoNaEmpresa ) {

        this.tempoNaEmpresa = tempoNaEmpresa > 0 ? tempoNaEmpresa : 0;

    }

    @Override
    public void reajustarSalario ( double percentual ) {

        if ( percentual > 0 ) {

            double percentualBonus = 0.1 * tempoNaEmpresa;
            super.reajustarSalario( percentual + percentualBonus );

        }

    }

    @Override
    public String toString () {

        return String.format("%s, %d", super.toString(), tempoNaEmpresa );

    }
    
}
