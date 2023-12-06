import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField campoCpf;
    private JPasswordField campoSenha;

    private String cpfCadastrado = "123.456.789-00";
    private String senhaCadastrada = "senha123";

    public Login() {
        super("Página de Login");

        setLayout(new GridLayout(3, 2));

        JLabel rotuloCpf = new JLabel("CPF:");
        campoCpf = new JTextField();

        JLabel rotuloSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField();

        JButton botaoLogin = new JButton("Login");
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });

        add(rotuloCpf);
        add(campoCpf);
        add(rotuloSenha);
        add(campoSenha);
        add(new JLabel());
        add(botaoLogin);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void realizarLogin() {
        String cpfDigitado = campoCpf.getText();
        String senhaDigitada = new String(campoSenha.getPassword());

        if (cpfDigitado.equals(cpfCadastrado) && senhaDigitada.equals(senhaCadastrada)) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
            levausuario();
        } else {
            JOptionPane.showMessageDialog(this, "CPF ou senha incorretos. Tente novamente.");
        }
    }


    private void levausuario() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new levausuario();
            }
        });
        dispose(); // fecha a página quando o login dá certo
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login();
            }
        });
    }
}