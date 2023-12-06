import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class janelo extends JFrame implements ActionListener {

    JMenuBar barraMenu;
    JMenu opcao;
    JMenuItem usuario;
    JMenuItem admin;
    JButton buttonBuscarLivros;

    

    public janelo() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 100);
        this.setLayout(new FlowLayout());

        barraMenu = new JMenuBar();
        opcao = new JMenu("Menu");

        usuario = new JMenuItem("Usuário");
        admin = new JMenuItem("Admin");

        usuario.addActionListener(this);
        admin.addActionListener(this);

        opcao.add(usuario);
        opcao.add(admin);
        barraMenu.add(opcao);

        buttonBuscarLivros = new JButton("Buscar Livros");
        buttonBuscarLivros.addActionListener(this); // Corrigindo o ActionListener

        this.add(buttonBuscarLivros); // Adicionando o botão de buscar livros
        this.setJMenuBar(barraMenu);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Livro[] livros;
        Livro livro = new Livro();
        livros = livro.carregaLivros( "livros.txt" );

        if (e.getSource() == usuario) {
            levausuario usu = new levausuario(); // Instancie a classe LevaUsuario aqui
        }

        if (e.getSource() == admin) {
            LevaAdmin adi = new LevaAdmin(); // Instancie a classe LevaAdmin aqui
        }
        if (e.getSource() == buttonBuscarLivros) {
            Operacoes op_0 = new Operacoes();
            op_0.buscarLivros();
        }
    }
}
