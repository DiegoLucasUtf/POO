import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Cliente extends Pessoa {

    public Cliente () {
 
        super ( 0, "", "", "" );
        this.telefone = "";

    }


    private String telefone;


    // Setters da Classe 
    public void setTelefone ( String telefone ) {

        this.telefone = telefone;

    }

    
    //Getters da Classe
    public String getTelefone() {

        return telefone;

    }


    // Busca um Cliente pelo Id
    public Cliente buscarPorId ( Cliente[] clientes, int idBuscar ) {

        Cliente c = new Cliente();

        for ( Cliente cliente : clientes ) {

            if ( cliente.getId() == idBuscar ) {

                int id = cliente.getId();
                String nome = cliente.getNome();

                System.out.println ( "Id......:" + cliente.getId() );
                System.out.println ( "Nome...:" + cliente.getNome() );
                System.out.println("-------------------------------------");

                c.setId( id );
                c.setNome( nome );
            }
        }

        return c;

    }


    /* Lê dados de um arquivo de texto, cria objetos Cliente com base nessas informações, 
    armazena-os em um Array e retorna esse array de clientes */
    public Cliente[] carregaClientes ( String fileName ) {

        File file = new File ( fileName );

        Cliente cliente = new Cliente();
        Cliente[] clientes;

        Operacoes operacoes = new Operacoes();

        // Inicializa o Array de Clientes com um tamanho igual ao número de linhas no arquivo
        clientes = new Cliente [ operacoes.contaLinhas ( file ) ];

        try {
            
            FileInputStream fis = new FileInputStream ( file );
            InputStreamReader isr = new InputStreamReader ( fis, "UTF-8" );
            BufferedReader bf = new BufferedReader ( isr );
            String linha = bf.readLine();

            int linhas = 0;

            while ( true ) {

                linha = bf.readLine();

                if ( linha == null ) {

                    break;

                }

                String[] dados = linha.split ( ";" );


                cliente = new Cliente();

                cliente.setId ( Integer.parseInt ( dados[0] ) );
                cliente.setNome ( dados[1] );
                cliente.setCpf ( dados[2] );
                cliente.setTelefone ( dados[4] );

                clientes[linhas] = cliente;

                linhas++;

            }

            bf.close();

        }  catch (Exception e) {

            e.printStackTrace();

        }

        return clientes;

    }


    // Lista os Clientes Cadastrados
    public void Listagem ( Cliente[] clientes ) {
       
        System.out.println ( "\n\n\nListando os Clientes" );
        
        for ( Cliente cliente : clientes ) {

            System.out.println ( "Id......:" + cliente.getId() );
            System.out.println ( "Nome....:" + cliente.getNome() );
            System.out.println ( "CPF.....:" + cliente.getCpf() );
            System.out.println ( "Telefone:" + cliente.getTelefone() );
            System.out.println ( "-------------------------------------" );

        }
    }
}
