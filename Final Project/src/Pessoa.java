public class Pessoa {

    public Pessoa ( int id, String nome, String cpf, String senha ) {

        this.id = 0;
        this.nome = "";
        this.cpf = "";
        this.senha = "";

    }


    private int id;
    private String nome;
    private String cpf;
    private String senha;


    // Setters da Classe
    public void setId ( int id ) {

        this.id = id;

    }

    public void setNome ( String nome ) {

        this.nome = nome;

    }

    public void setCpf ( String cpf ) {

        this.cpf = cpf;

    }

    public void setSenha ( String senha ) {

        this.senha = senha;

    }


    // Getter da Classe
    public int getId() {

        return id;

    }

    public String getNome() {

        return nome;

    }

    public String getCpf() {

        return cpf;

    }

    public String getSenha() {

        return senha;

    }
}
