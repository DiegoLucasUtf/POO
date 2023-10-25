public class LivroDeNotas {
    
    public String nomeDisciplina;

    public LivroDeNotas ( String nomeDisciplina ) {

        this.nomeDisciplina = nomeDisciplina;

    }

    public void mostrarMensagem ( ) {

        System.out.println( " Bem vindo ao livro de notas da disciplina " + nomeDisciplina );

    }

    public void setDisciplina ( String nomeDisciplina ) {

        // Especifica que está falando do parâmetro e não do atributo
        this.nomeDisciplina = nomeDisciplina;

    }

}
