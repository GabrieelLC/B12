
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CadastroUsuarios {

    private Botoes botoes;

    public CadastroUsuarios() {

    }

    public static void abrirCadastroUsuarios(JFrame principal) {
        JDialog cadastroUsuarios = new JDialog(principal, "Cadastro de Usuários", true);
        cadastroUsuarios.setSize(600, 300);
        cadastroUsuarios.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Cadastro de Usuários", SwingConstants.CENTER);
        cadastroUsuarios.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(4, 2, 5, 5));
        painelCampos.add(new JLabel("Usuário:"));
        painelCampos.add(new JTextField(25));
        painelCampos.add(new JLabel("Senha:"));
        painelCampos.add(new JPasswordField(15));
        painelCampos.add(new JLabel("Email:"));
        painelCampos.add(new JTextField(30));
        painelCampos.add(new JLabel("Ativo:"));
        JRadioButton radioAtivo = new JRadioButton();
        painelCampos.add(radioAtivo);

        JPanel painelBotoes = Botoes.criarPainelBotoes(cadastroUsuarios);

        cadastroUsuarios.add(painelCampos, BorderLayout.CENTER);
        cadastroUsuarios.add(painelBotoes, BorderLayout.SOUTH);
        cadastroUsuarios.setLocationRelativeTo(principal);
        cadastroUsuarios.setVisible(true);
    }

}
