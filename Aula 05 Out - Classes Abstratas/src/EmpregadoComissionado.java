public class EmpregadoComissionado extends Empregado {

    private double vendasBrutas;
    private double taxaComissao;

    public EmpregadoComissionado ( String nm, String sn, String cpf, double vendasBrutas, double taxa ) {

        super(nm, sn, cpf);

        setVendasBrutas( vendasBrutas );
        setTaxaComissao( taxa );

    }

    // Setters
    public final void setTaxaComissao(double taxaComissao) {

        this.taxaComissao = taxaComissao > 0 ? taxaComissao : 0;

    }

    public final void setVendasBrutas(double vendasBrutas) {

        this.vendasBrutas = vendasBrutas > 0 ? vendasBrutas : 0;

    }
    
    // Getters
    public double getTaxaComissao() {

        return taxaComissao;

    }

    public double getVendasBrutas() {

        return vendasBrutas;

    }

    // Método Rendimentos
    @Override
    public double rendimentos () {

        return getVendasBrutas() * getTaxaComissao();

    }

    // Método de Impressão
    @Override
    public String toString () {

        return String.format ( "%s: %s\n%s: R$%,.2f; %s: %,.2f",
                                    "\nEmpregado Comissionado", super.toString(),
                                     "\nVendas Brutas:", getVendasBrutas(),
                                     "Taxa de comissão", getTaxaComissao() );
    }

}
