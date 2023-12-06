import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pesquisa extends JFrame {

    private JTextField campoPesquisa;

    public pesquisa() {
        super("Barra de Pesquisa");

        setLayout(new FlowLayout());

        campoPesquisa = new JTextField(20);
        JButton botaoPesquisar = new JButton("Pesquisar");

        botaoPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String termoPesquisa = campoPesquisa.getText();
                // Lógica para lidar com a pesquisa usando o termoPesquisa
                JOptionPane.showMessageDialog(pesquisa.this, "Pesquisando por: " + termoPesquisa);
            }
        });

        add(campoPesquisa);
        add(botaoPesquisar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pesquisa();
            }
        });
    }
}
