public class Recibo {

    private String numeroPeca;
    private String descricaoPeca;
    private int qtdPeca;
    private double precoUnitario;

    public Recibo ( String numeroPeca, String descricaoPeca, int qtdPeca, double precoUnitario ) {

        setNumeroPeca(numeroPeca);
        setDescricaoPeca(descricaoPeca);
        setQtdPeca(qtdPeca);
        setPrecoUnitario(precoUnitario);

    }

    // Sobrescreve o Método Valor de Pagamento
    @Override
    public double GetValorPagamento () {

        return getQtdPeca() * getPrecoUnitario();
    
    }

    // Sobrescreve o método toString
    @Override
    public String toString () {

        return String.format("Recibo:\nNúmero da Peça: %s (%s)\nQuantidade: %d\nValor Unitário: %.2f",
                                    getNumeroPeca(), getDescricaoPeca(), 
                                    getQtdPeca(), 
                                    getPrecoUnitario() );
    }

    // Setters
    public void setDescricaoPeca(String descricaoPeca) {

        this.descricaoPeca = descricaoPeca;

    }

    public void setNumeroPeca(String numeroPeca) {

        this.numeroPeca = numeroPeca;

    }

    public void setQtdPeca(int qtdPeca) {

        this.qtdPeca = qtdPeca > 0 ? qtdPeca : 0;

    }

    public void setPrecoUnitario(double precoUnitario) {

        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0;

    }


    // Getters
    public String getDescricaoPeca() {

        return descricaoPeca;

    }

    public String getNumeroPeca() {

        return numeroPeca;

    }

    public int getQtdPeca() {

        return qtdPeca;

    }

    public double getPrecoUnitario() {

        return precoUnitario;

    }

    
    
}
