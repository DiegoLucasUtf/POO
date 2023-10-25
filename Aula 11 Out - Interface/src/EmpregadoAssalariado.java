public class EmpregadoAssalariado extends Empregado {

    private double salarioMensal;

    public EmpregadoAssalariado ( String nm, String sb, String cpf, double salario ) {

        super(nm, sb, cpf);
        setSalarioMensal(salario);

    }

    // Setters
    public void setSalarioMensal ( double salarioMensal ) {

        this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0;

    }

    // Getters
    public double getSalarioMensal () {

        return salarioMensal;

    }

    @Override
    public double getValorPagamento () {

        return getSalarioMensal();

    }

    @Override
    public String toString () {

        return String.format("%s \nSalario Mensal: %.2f", super.toString(), getSalarioMensal() );

    }
    
}
