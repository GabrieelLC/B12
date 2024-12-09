
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class ListaPessoas {

    public ListaPessoas() {
    }

    public static void abrirListaPessoas(JFrame principal) {
        JDialog listaPessoas = new JDialog(principal, "Lista de Pessoas", true);
        listaPessoas.setSize(750, 650);
        listaPessoas.setLayout(new BorderLayout());

        listaPessoas.add(new JLabel("Lista de Pessoas", SwingConstants.CENTER), BorderLayout.NORTH);
        listaPessoas.add(new JTextArea("Exemplo de lista de pessoas..."), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> listaPessoas.setVisible(false));
        listaPessoas.add(btnFechar, BorderLayout.SOUTH);

        listaPessoas.setLocationRelativeTo(principal);
        listaPessoas.setVisible(true);
    }
}
