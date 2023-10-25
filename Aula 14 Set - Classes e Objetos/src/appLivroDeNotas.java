public class appLivroDeNotas {
    
    public static void main ( String[] args ) {

        LivroDeNotas livroNotas = new LivroDeNotas( "Linguagem de Programação Estruturada");
        livroNotas.mostrarMensagem();

        // Menos Indicado
        livroNotas.nomeDisciplina = "Linguagem de Programação Orientada a Objetos I";
        livroNotas.mostrarMensagem();

        // Mais indicado modificar o valor do atributo através de um método
        livroNotas.setDisciplina( "Linguagem de Programação Orientada a Objetos II " );
        livroNotas.mostrarMensagem();


    }
}
