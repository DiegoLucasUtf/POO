import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LevaAdmin extends JFrame {
        
    private String nome;
    private String cpf;
    private String email;
    private JButton botaoGenLivro;
    private JButton botaoGenCliente;
    private JButton botaoGenEmprestimo;

    public LevaAdmin() {

        super("Página do Administrador");

        setLayout(new GridLayout(4, 1));

        JLabel rotuloNome = new JLabel("Nome:");
        JLabel rotuloCpf = new JLabel("CPF:");
        JLabel rotuloEmail= new JLabel("email:");

        botaoGenLivro = new JButton("Gerencia Livros");
        botaoGenLivro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Operacoes op_1 = new Operacoes();
                op_1.ListarLivros();

            }
        });

        botaoGenCliente = new JButton("Gerencia Clientes");
        botaoGenCliente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Operacoes op_2 = new Operacoes();
                op_2.ListarClientes();

            }
        });

        botaoGenEmprestimo = new JButton("Gerencia Empréstimo");
        botaoGenEmprestimo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                Operacoes op_3 = new Operacoes();
                op_3.ListarEmprestimos();
            }
        });

        nome = "Jefferson Jorge";
        cpf = "44444444444";
        email = "jefinho@gmail.com";

        add(new JLabel());
        add(rotuloNome);
        add(new JLabel(nome));
        add(Box.createVerticalStrut(5));

        add(new JLabel());
        add(rotuloCpf);
        add(new JLabel(cpf));
        add(Box.createVerticalStrut(5));

        add(new JLabel());
        add(rotuloEmail);
        add(new JLabel(email));
        add(Box.createVerticalStrut(5));

        
        add(botaoGenLivro);

        add(botaoGenCliente);
        
        add(botaoGenEmprestimo);
        

        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void abrirPaginaGerenciarLivro() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaginaGerenciarLivro();
            }
        });
    }

    private void abrirPaginaGerenciarCliente() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaginaGerenciarCliente();
            }
        });
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LevaAdmin();
            }
        });
    }
} 


class PaginaGerenciarLivro extends JFrame {
    public PaginaGerenciarLivro() {
        super("Gerenciamento de Livros");

        setSize(200, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

class PaginaGerenciarCliente extends JFrame {
    public PaginaGerenciarCliente() {

        super("Gerenciamento de Clientes");

        setSize(300, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
