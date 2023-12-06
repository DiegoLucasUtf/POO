import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Livro {

    // Construtor da Classe
    public Livro () {

        this.id = 0;
        this.titulo = "";
        this.autor = "";
        this.editora = "";
        this.genero = "";

    }


    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private String genero;
    

    // Setters da Classe
    public void setId ( int id ) {

        this.id = id;

    }

    public void setTitulo ( String titulo ) {

        this.titulo = titulo;

    }

    public void setAutor ( String autor ) {

        this.autor = autor;

    }

    public void setEditora ( String editora ) {

        this.editora = editora;

    }
 
    public void setGenero ( String genero ) {

        this.genero = genero;

    }


    // Getters da Classe
    public int getId () {

        return id;

    }

    public String getTitulo () {

        return titulo;

    }

    public String getAutor () {

        return autor;

    }

    public String getEditora () {

        return editora;

    }

    public String getGenero() {

        return genero;

    }


    // Busca um Livro pelo Id
    public Livro buscarId ( Livro[] livros,int idBuscar ) {

        Livro l = new Livro();

        for ( Livro livro : livros ) {
 
            if ( livro.getId() == idBuscar ) {

                id = livro.getId ();
                titulo = livro.getTitulo ();
                autor = livro.getAutor ();

                System.out.println ( "Id......:" + id );
                System.out.println ( "Título..:" + titulo );
                System.out.println ( "Autor...:" + autor );
                System.out.println ("----------------" );

                l.setId ( id );
                l.setAutor ( autor );
                l.setTitulo ( titulo );

                break;

            }
        }

        return l;

    }


    // Busca o Livro pelo titulo ou pelo Autor
    public void buscar ( Livro[] livros, String nome ) { 

        for ( Livro livro : livros ) {

            //buscar por títulos ou autores que tenham parte daquilo que foi digitado
            if ( livro.getTitulo().toLowerCase().contains ( nome.toLowerCase() ) || livro.getAutor().toLowerCase().contains ( nome.toLowerCase () ) ) {

                System.out.println ( "Id......:" + livro.getId() );
                System.out.println ( "Título..:" + livro.getTitulo() );
                System.out.println ( "Autor...:" + livro.getAutor() );
                System.out.println ( "-------------------------------------" );

            }
        }
        
    }


    // Cria um Array com os livros do arquivo
    public Livro[] carregaLivros ( String fileName ) {

        File file = new File ( fileName );
    
        Livro livro;
        Livro[] livros;

        Operacoes operacoes = new Operacoes();

        livros = new Livro [ operacoes.contaLinhas ( file ) ];

        try {

            FileInputStream fis = new FileInputStream ( file );

            InputStreamReader isr = new InputStreamReader ( fis, "UTF-8" );

            BufferedReader bf = new BufferedReader ( isr );

            String linha;

            linha = bf.readLine();

            int linhas=0;

            while ( true ) { 

                linha = bf.readLine();

                if ( linha == null ) {

                    break;

                }

                String[] dados = linha.split ( ";" );

                livro = new Livro();

                livro.setId ( Integer.parseInt ( dados[0] ) );

                livro.setTitulo ( dados[1] );
                livro.setAutor ( dados[2] );

                livros [linhas] = livro;

                linhas++;
            }

            bf.close();

        }  catch (Exception e) {

            e.printStackTrace();

        }

        return livros;

    }

    // Método que lista os Livros
    public void Listagem ( Livro[] livros ) {

        System.out.println( "\n\n\nListando os Livros" );

        for ( Livro livro_aux : livros ) {

            System.out.println ( "Id......:" + livro_aux.getId() );
            System.out.println ( "Título..:" + livro_aux.getTitulo() );
            System.out.println ( "Autor...:" + livro_aux.getAutor() );
            System.out.println ( "-------------------------------------" );

        }

    }

}