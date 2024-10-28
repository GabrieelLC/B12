import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaDePessoa extends JFrame {

    public SistemaDePessoa() {
        // Configurações da Janela Principal
        setTitle("Sistema de Pessoa");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // Menu "Cadastro"
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenuItem menuItemUsuarios = new JMenuItem("Usuários");
        JMenuItem menuItemPessoas = new JMenuItem("Pessoas");

        menuCadastro.add(menuItemUsuarios);
        menuCadastro.add(menuItemPessoas);

        // Menu "Visualização"
        JMenu menuVisualizacao = new JMenu("Visualização");
        JMenuItem menuItemListaUsuario = new JMenuItem("Lista de usuário");
        JMenuItem menuItemListaPessoas = new JMenuItem("Lista de Pessoas");

        menuVisualizacao.add(menuItemListaUsuario);
        menuVisualizacao.add(menuItemListaPessoas);

        // Menu "Sair"
        JMenu menuSair = new JMenu("Sair");

        // Adiciona os menus à barra de menus
        menuBar.add(menuCadastro);
        menuBar.add(menuVisualizacao);
        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        // Área principal da janela (para expandir e ocupar espaço)
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        add(mainPanel, BorderLayout.CENTER);

        // Rodapé
        JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel footerLabel = new JLabel("Versão: 12.1.2024    Usuário: denys.silva    Data de acesso: 20/09/2024 10:58");
        footerPanel.add(footerLabel);
        add(footerPanel, BorderLayout.SOUTH);

        // Ação para abrir a janela de cadastro de usuários
        menuItemUsuarios.addActionListener(e -> abrirJanelaCadastroUsuarios());

        // Ação para "Sair"
        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent e) {
                System.exit(0);
            }
            public void menuDeselected(javax.swing.event.MenuEvent e) {}
            public void menuCanceled(javax.swing.event.MenuEvent e) {}
        });
    }

    // Método para abrir a janela de cadastro de usuários
    private void abrirJanelaCadastroUsuarios() {
        JFrame cadastroUsuariosFrame = new JFrame("Cadastro de Usuários");
        cadastroUsuariosFrame.setSize(400, 300);
        cadastroUsuariosFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadastroUsuariosFrame.setLocationRelativeTo(null);

        // Painel de cadastro
        JPanel cadastroPanel = new JPanel();
        cadastroPanel.setLayout(new GridLayout(5, 2, 5, 5));
        cadastroPanel.setBackground(Color.WHITE);

        // Campos de entrada
        cadastroPanel.add(new JLabel("Usuário:", SwingConstants.RIGHT));
        JTextField usuarioField = new JTextField();
        cadastroPanel.add(usuarioField);

        cadastroPanel.add(new JLabel("Senha:", SwingConstants.RIGHT));
        JPasswordField senhaField = new JPasswordField();
        cadastroPanel.add(senhaField);

        cadastroPanel.add(new JLabel("Email:", SwingConstants.RIGHT));
        JTextField emailField = new JTextField();
        cadastroPanel.add(emailField);

        cadastroPanel.add(new JLabel("Ativo:", SwingConstants.RIGHT));
        JCheckBox ativoCheckBox = new JCheckBox();
        cadastroPanel.add(ativoCheckBox);

        // Painel de botões
        JPanel botoesPanel = new JPanel();
        botoesPanel.setLayout(new FlowLayout());

        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("Cancelar");
        JButton btnSair = new JButton("Sair");

        botoesPanel.add(btnSalvar);
        botoesPanel.add(btnCancelar);
        botoesPanel.add(btnSair);

        // Ações dos botões
        btnSalvar.addActionListener(e -> JOptionPane.showMessageDialog(cadastroUsuariosFrame, "Salvado com sucesso!"));
        btnCancelar.addActionListener(e -> JOptionPane.showMessageDialog(cadastroUsuariosFrame, "Botão clicado: Cancelar"));

        // Ação para fechar a janela ao clicar em "Sair"
        btnSair.addActionListener(e -> cadastroUsuariosFrame.dispose());

        // Adiciona o painel de cadastro e o painel de botões na janela de cadastro de usuários
        cadastroUsuariosFrame.add(cadastroPanel, BorderLayout.CENTER);
        cadastroUsuariosFrame.add(botoesPanel, BorderLayout.SOUTH);

        cadastroUsuariosFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SistemaDePessoa frame = new SistemaDePessoa();
            frame.setVisible(true);
        });
    }
}
