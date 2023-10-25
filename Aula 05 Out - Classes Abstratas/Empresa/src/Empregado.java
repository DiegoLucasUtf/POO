public abstract class Empregado {
    
    private String nome;
    private String sobrenome;
    private String cpf;

    // Construtor com Três argumentos
    public Empregado ( String nm, String sb, String cpf ) {

        nome= nm;
        sobrenome = sb;
        this.cpf = cpf;

    }

    // Método Abstrato que obriga a todos os filhos dessa classe a implementarem ele
    public abstract double Rendimentos ();

    // Método que imprime na tela
    @Override
    public String toString() {

        return String.format ( "%s %s \nCPF: %s", getNome(), getSobrenome(), getCPF() );

    }

    // Getters
    public String getNome() {

        return nome;

    }

    public String getSobrenome() {

        return sobrenome;

    }

    public String getCPF() {

        return cpf;

    }

    // Setters
    public void setNome ( String nome ) {

        this.nome = nome;

    }

    public void setSobrenome ( String sobrenome ) {

        this.sobrenome = sobrenome;

    }

    public void setCPF ( String cpf ) {

        this.cpf = cpf;

    }
    

}
