
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaPessoa extends JFrame {

    public SistemaPessoa() {
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

        // Ação para "Sair"
        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent e) {
                System.exit(0);
            }
            public void menuDeselected(javax.swing.event.MenuEvent e) {}
            public void menuCanceled(javax.swing.event.MenuEvent e) {}
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SistemaPessoa frame = new SistemaPessoa();
            frame.setVisible(true);
        });
    }
}
