
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class ListaUsuarios {

    public ListaUsuarios() {
    }

    public static void abrirListaUsuarios(JFrame principal) {
        JDialog listaUsuarios = new JDialog(principal, "Lista de Usuários", true);
        listaUsuarios.setSize(750, 650);
        listaUsuarios.setLayout(new BorderLayout());

        listaUsuarios.add(new JLabel("Lista de Usuários", SwingConstants.CENTER), BorderLayout.NORTH);
        listaUsuarios.add(new JTextArea("Exemplo de lista de usuários..."), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> listaUsuarios.setVisible(false));
        listaUsuarios.add(btnFechar, BorderLayout.SOUTH);

        listaUsuarios.setLocationRelativeTo(principal);
        listaUsuarios.setVisible(true);
    }

}
