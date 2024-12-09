import java.awt.*;
import javax.swing.*;

public class CadastroPessoa extends JPanel {

    public CadastroPessoa() {
        // Definir layout como GridBagLayout para melhor controle de posicionamento
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Configurações gerais de espaçamento
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes
        gbc.anchor = GridBagConstraints.WEST;

        // Título no topo
        JLabel tituloLabel = new JLabel("Cadastro de Pessoas");
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
        JLabel nomeLabel = new JLabel("Nome:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(nomeLabel, gbc);

        JTextField nomeField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(nomeField, gbc);

        JLabel enderecoLabel = new JLabel("Endereço:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(enderecoLabel, gbc);

        JTextField enderecoField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(enderecoField, gbc);

        JLabel cidadeLabel = new JLabel("Cidade:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(cidadeLabel, gbc);

        JTextField cidadeField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(cidadeField, gbc);

        JLabel ufLabel = new JLabel("UF:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(ufLabel, gbc);

        JTextField ufField = new JTextField(5);
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(ufField, gbc);

        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(emailField, gbc);

        JLabel telefoneLabel = new JLabel("Telefone:");
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(telefoneLabel, gbc);

        JTextField telefoneField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 6;
        add(telefoneField, gbc);

        JLabel sexoLabel = new JLabel("Sexo:");
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(sexoLabel, gbc);

        String[] sexoOptions = { "Masculino", "Feminino", "Outro" };
        JComboBox<String> sexoComboBox = new JComboBox<>(sexoOptions);
        gbc.gridx = 1;
        gbc.gridy = 7;
        add(sexoComboBox, gbc);

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
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(buttonPanel, gbc);
    }

    public static void main(String[] args) {
        // Criar janela para testar o painel
        JFrame frame = new JFrame("Cadastro de Pessoa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CadastroPessoa());
        frame.pack();
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    }
}
