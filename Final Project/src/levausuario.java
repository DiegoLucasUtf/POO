import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class levausuario extends JFrame {

    private String nome;
    private String cpf;
    private String telefone;
    private JButton botaoEmprestimo;

    public levausuario() {
        super("Página do Cliente");

        setLayout(new GridLayout(4, 3));

        JLabel rotuloNome = new JLabel("Nome:");
        JLabel rotuloCpf = new JLabel("CPF:");
        JLabel rotuloTelefone = new JLabel("Telefone:");

        botaoEmprestimo = new JButton ("Realizar Empréstimo" );
        botaoEmprestimo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Operacoes op_4 = new Operacoes();
                op_4.EmprestarLivro();

            }
        });

        nome = "Diego";
        cpf = "11111111111";
        telefone = "(45)999999999";

        add(new JLabel());
        add(rotuloNome);    
        add(new JLabel(nome));
        add(Box.createVerticalStrut(5));

        add(new JLabel());
        add(rotuloCpf);
        add(new JLabel(cpf));
        add(Box.createVerticalStrut(5));

        add(new JLabel());
        add(rotuloTelefone);
        add(new JLabel(telefone));
        add(Box.createVerticalStrut(5));

        add(new JLabel());
        add(botaoEmprestimo);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new levausuario();
            }
        });
    }
}
