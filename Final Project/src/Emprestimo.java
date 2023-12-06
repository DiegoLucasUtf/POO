import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import java.io.InputStreamReader;

public class Emprestimo {

    public Emprestimo () {

        this.id = 0;
        this.idCliente = 0;
        this.idLivro = 0;

    }


    private int id;
    private int idCliente;
    private int idLivro;


    // Setters da Classe
    public void setId ( int id ) {

        this.id = id;

    }

    public void setidCliente ( int idCliente ) {

        this.idCliente = idCliente;

    }

    public void setIdLivro ( int idLivro ) {

        this.idLivro = idLivro;

    }


    // Getters da Classe
    public int getId() {

        return id;

    }

    public int getIdCliente() {

        return idCliente;

    }

    public int getIdLivro() {

        return idLivro;

    }


    // Método que lista os Empréstimos
    public void Listagem ( Emprestimo[] emps ) {

        System.out.println( "\n\n\nListando os Empréstimos" );

        for ( Emprestimo emprestimo : emps ) {

            System.out.println ( "\nId......:" + emprestimo.getId() );
            System.out.println ( "Leitor..:" + emprestimo.getIdCliente() );
            System.out.println ( "Livro...:" + emprestimo.getIdLivro() );
            System.out.println ("-------------------------------------\n" );

        }

    }


    // Carrega os empréstimos do Arquivo para um Vetor
    public Emprestimo[] carregaEmprestimos ( String fileName ) {

        File file = new File ( fileName );

        Emprestimo emprestimo;
        Emprestimo[] emprestimos;
        Operacoes operacoes = new Operacoes();
        emprestimos = new Emprestimo [ operacoes.contaLinhas ( file ) ];

        try {

            FileInputStream fis = new FileInputStream ( file );
            InputStreamReader isr = new InputStreamReader ( fis, "UTF-8" );
            BufferedReader bf = new BufferedReader ( isr );

            String linha;
            linha = bf.readLine();

            int linhas = 0;

            while ( true ) {

                linha = bf.readLine();

                if( linha == null ) {

                    break;

                }

                String[] dados = linha.split ( ";" );
                emprestimo = new Emprestimo();

                emprestimo.setId ( Integer.parseInt ( dados[0] ) );
                emprestimo.setidCliente ( Integer.parseInt ( dados[1] ) );
                emprestimo.setIdLivro ( Integer.parseInt ( dados[2] ) );

                emprestimos[linhas] = emprestimo;
                linhas++;

            }

            bf.close();

        }  catch (Exception e) {

            e.printStackTrace();

        }

        return emprestimos;

    }


    // Cria um novo Array de empréstimos maior que o último, adiciona o novo empréstimo e copia os elementos do Array anterior
    public Emprestimo[] adicionaEmprestimo ( Emprestimo[] emps, Emprestimo emp ) {

        Emprestimo[] emprestimos = new Emprestimo [ emps.length + 1 ];

        for ( int i = 0; i < emps.length; i++ ) {

            emprestimos[i] = emps[i];
            System.out.println ( "Código de Empréstimo: "+ emprestimos[i].getId() );

        }

        emprestimos [ emps.length ] = emp; 

        // Grava as informações no Arquivo
        this.gravaEmprestimos ( "emprestimos.txt", emp  );

        return emprestimos;

    }


    // Grava o Novo empréstimo no arquivo txt
    public void gravaEmprestimos ( String filename, Emprestimo emprestimo ) {

        try {

            File file = new File ( filename );

            FileWriter fw = new FileWriter ( file, true );

            id = emprestimo.getId();
            idCliente = emprestimo.getIdCliente();
            idLivro = emprestimo.getIdLivro();

            fw.write ( "\n" + id + ";" + idCliente + ";" + idLivro + ";" );
            fw.close ();
            
        } catch ( Exception e ) {

            e.printStackTrace();

        }
    }


    // Busca os Empréstimos do Livro 
    public Emprestimo buscarEmprestimoPorIdDeLivro ( Emprestimo[] emprestimos, int idBuscar ) {

        Emprestimo emp = new Emprestimo();

        for ( Emprestimo emprestimo : emprestimos ) {  

            

            // Aqui é idLivro pois vamos verificar se o livro se encontra emprestado
            if ( emprestimo.getIdLivro() == idBuscar ) { 

                id = emprestimo.getId();
                idCliente = emprestimo.getIdCliente();
                idLivro = emprestimo.getIdLivro();
                

                emp.setId(id);
                emp.setidCliente(idCliente);
                emp.setIdLivro(idLivro);
                
                break;

            }    
        }

        return emp;

    }


    public void realizarEmprestimo ( Emprestimo[] emprestimos, Livro[] livros, Cliente[] clientes ) {

        String auxIdCliente = JOptionPane.showInputDialog ( null, "Digite o Código do Cliente" );
        int idCliente = Integer.parseInt(auxIdCliente);

        String auxIdLivro = JOptionPane.showInputDialog ( null, "Digite o Código do Livro" );
        int idLivro = Integer.parseInt(auxIdLivro);

        // Verifica se o Livro existe
        Livro livro = new Livro();
        livro = livro.buscarId( livros, idLivro);
        
        // Verifica se o Cliente existe
        Cliente cliente = new Cliente();
        cliente = cliente.buscarPorId ( clientes, idCliente );
        
        if ( livro.getId() == 0 ) {

            JOptionPane.showMessageDialog ( null, "Livro não existente" );
            return;

        }

        if ( cliente.getId() == 0 ) {

            JOptionPane.showMessageDialog ( null, "Cliente não existente" );
            return;

        }
        
        // Verificar se o livro esta disponivel
        Emprestimo empTeste;
        empTeste = new Emprestimo();
        empTeste = empTeste.buscarEmprestimoPorIdDeLivro ( emprestimos, idLivro );
        
        if ( empTeste.getIdLivro() != 0 ) {

            JOptionPane.showMessageDialog ( null, "O Livro encontra-se Emprestado" );
            
        } else {

            String confirma = JOptionPane.showInputDialog ( "Confirmar Empréstimo? (S/N)" );

            if ( confirma.equals ( "S" ) || confirma.equals ( "s" ) ) {

                // Adicionar na lista de emprestimos
                JOptionPane.showMessageDialog ( null, "Empréstimo confirmado" );

                Emprestimo emp = new Emprestimo();
                emp.setId ( emprestimos.length + 1 );
                emp.setidCliente ( idCliente );
                emp.setIdLivro ( idLivro );

                adicionaEmprestimo ( emprestimos, emp );

            } else {

                JOptionPane.showMessageDialog ( null, "Operação Cancelanda" );
                return;

            }
        }

    }

}
