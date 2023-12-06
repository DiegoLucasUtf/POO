import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;

public class Operacoes {
    
    Livro livro;
    
    
    public int contaLinhas ( File file ) {

        JOptionPane.showMessageDialog ( null, "Contabilizando os Registros..." );
        
        int total = 0;

        try {

            FileReader isr = new FileReader ( file );
            BufferedReader bf = new BufferedReader ( isr );
            String linha;

            linha=bf.readLine();

            int linhas=0;

            while ( true ) {

                linha = bf.readLine();

                if ( linha == null ) {

                    break;

                }

                linhas++;

            }

            total = linhas;

            bf.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return total;

    }

    public void buscarLivros () {

        Livro[] livros;
        Livro livro = new Livro();
        livros = livro.carregaLivros ( "livros.txt" );
       
        String nome = JOptionPane.showInputDialog ( null, "Digite o Nome do Autor ou do Título desejado" );
        
        livro.buscar ( livros, nome );
        
    }

    public void ListarClientes () {

        Cliente[] clientes;
        Cliente cliente = new Cliente();

        clientes = cliente.carregaClientes ( "clientes.txt" );
        
        if ( clientes != null ) {

            cliente.Listagem ( clientes ); 

        } else {

            System.out.println("Erro: Nenhum cliente encontrado.");

        }
        
    }

    public void ListarLivros () {

        Livro[] livros;
        Livro livro = new Livro();
        livros = livro.carregaLivros ( "livros.txt" );
        
        livro.Listagem(livros); 
        
    }

    public void ListarEmprestimos () {

        Emprestimo[] emprestimos;
        Emprestimo emprestimo = new Emprestimo();
        emprestimos = emprestimo.carregaEmprestimos( "emprestimos.txt");
        
        emprestimo.Listagem ( emprestimos ); 
        
    }

    public void EmprestarLivro () {

        Emprestimo[] emprestimos;
        Emprestimo emprestimo = new Emprestimo();
        emprestimos = emprestimo.carregaEmprestimos( "emprestimos.txt");

        Livro[] livros;
        Livro livro = new Livro();
        livros = livro.carregaLivros ( "livros.txt" );

        Cliente[] clientes;
        Cliente cliente = new Cliente();
        clientes = cliente.carregaClientes ( "clientes.txt" );

        emprestimo.realizarEmprestimo ( emprestimos, livros, clientes );

    }

}
