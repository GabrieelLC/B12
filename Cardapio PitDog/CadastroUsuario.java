import java.awt.*;
import javax.swing.*;

public class CadastroUsuario extends JPanel {

    public CadastroUsuario() {
        // Definir layout como GridBagLayout para melhor controle de posicionamento
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Configurações gerais de espaçamento
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes
        gbc.anchor = GridBagConstraints.WEST;

        // Título no topo
        JLabel tituloLabel = new JLabel("Cadastro de Usuários");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(tituloLabel, gbc);

        // Resetar gridwidth para os próximos componentes
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        // Labels e Campos de texto
        JLabel usuarioLabel = new JLabel("Usuário:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(usuarioLabel, gbc);

        JTextField usuarioField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(usuarioField, gbc);

        JLabel senhaLabel = new JLabel("Senha:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(senhaLabel, gbc);

        JPasswordField senhaField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(senhaField, gbc);

        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(emailField, gbc);

        JLabel ativoLabel = new JLabel("Ativo:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(ativoLabel, gbc);

        JRadioButton ativoRadioButton = new JRadioButton();
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(ativoRadioButton, gbc);

        // Painel para os botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 6, 10, 10));

        JButton incluirButton = new JButton("Incluir");
        JButton alterarButton = new JButton("Alterar");
        JButton excluirButton = new JButton("Excluir");
        JButton consultarButton = new JButton("Consultar");
        JButton cancelarButton = new JButton("Cancelar");
        JButton sairButton = new JButton("Sair");

        // Adicionar botões ao painel
        buttonPanel.add(incluirButton);
        buttonPanel.add(alterarButton);
        buttonPanel.add(excluirButton);
        buttonPanel.add(consultarButton);
        buttonPanel.add(cancelarButton);
        buttonPanel.add(sairButton);

        // Adicionar o painel de botões ao formulário
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(buttonPanel, gbc);
    }
}
