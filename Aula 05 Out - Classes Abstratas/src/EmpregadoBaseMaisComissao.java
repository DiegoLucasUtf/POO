public class EmpregadoBaseMaisComissao extends EmpregadoComissionado {

    public double salarioBase;

    public EmpregadoBaseMaisComissao ( String nm, String sn, String cpf, double vendasBrutas, double taxaComissao, double salarioBase ) {

        super(nm, sn, cpf, vendasBrutas, taxaComissao);

        setSalarioBase(salarioBase);

    }

    // Getters
    public double getSalarioBase() {

        return salarioBase;

    }

    // Setters
    public void setSalarioBase(double salarioBase) {

        this.salarioBase = salarioBase;

    }

    // Método Rendimentos, que não é mais obrigatório pois a classe pai, que é concreta, já implementou
    @Override
    public double rendimentos () {

        return super.rendimentos() + salarioBase;

    }

    // Método ToString
    @Override
    public String toString () {

        return String.format("%s\n%s: R$ %,.2f", super.toString(), "Salário Base: ", getSalarioBase() );

    }
    
}
