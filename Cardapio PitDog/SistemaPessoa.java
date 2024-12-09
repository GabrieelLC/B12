import cdpo.CadastroClientes;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SistemaPessoa extends JFrame {
    private JDesktopPane desktopPane;

    public SistemaPessoa() {
        // Configurações da Janela Principal
        setTitle("Sistema de Pessoa");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // Menus principais
        JMenu cadastroMenu = new JMenu("Cadastro");
        JMenu visualizacaoMenu = new JMenu("Visualização");
        JMenu sairMenu = new JMenu("Sair");

        // Submenus de Cadastro e Visualização
        JMenuItem usuariosMenuItem = new JMenuItem("Usuários");
        JMenuItem pessoasMenuItem = new JMenuItem("Pessoas");
        JMenuItem listaUsuariosItem = new JMenuItem("Lista de Usuário");
        JMenuItem listaPessoasItem = new JMenuItem("Lista de Pessoas");

        // Adiciona submenus aos menus principais
        cadastroMenu.add(usuariosMenuItem);
        cadastroMenu.add(pessoasMenuItem);
        visualizacaoMenu.add(listaUsuariosItem);
        visualizacaoMenu.add(listaPessoasItem);

        // Adiciona menus à barra de menus
        menuBar.add(cadastroMenu);
        menuBar.add(visualizacaoMenu);
        menuBar.add(sairMenu);

        // Configura a barra de menus
        setJMenuBar(menuBar);

        // Adicionar funcionalidade ao clicar no menu "Sair"
        sairMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0); // Encerra o programa ao clicar no menu "Sair"
            }
        });

        // Criar o JDesktopPane
        desktopPane = new JDesktopPane();
        add(desktopPane, BorderLayout.CENTER);

        // Função ao clicar no menu "Usuários" para abrir o cadastro de usuários
        usuariosMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroUsuario();
            }
        });

        pessoasMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroPessoa();
            }
        });

        // Criação do rodapé
        JPanel rodape = new JPanel();
        rodape.setLayout(new BorderLayout());

        // Texto do rodapé formatado
        JLabel rodapeLabel = new JLabel(
                "Versão: 12.1.2024    Usuário: denys.silva    Data de acesso: 20/09/2024 10:58",
                SwingConstants.CENTER);
        rodape.add(rodapeLabel, BorderLayout.CENTER);

        // Adicionar o rodapé à janela
        add(rodape, BorderLayout.SOUTH);
    }

    // Método para abrir o cadastro de usuários
    private void abrirCadastroUsuario() {
        // Verificar se já existe um JInternalFrame aberto
        for (JInternalFrame frame : desktopPane.getAllFrames()) {
            frame.dispose(); // Fecha qualquer frame aberto antes
        }

        // Criar e configurar um novo JInternalFrame para o cadastro
        JInternalFrame cadastroUsuarioFrame = new JInternalFrame("Cadastro de Usuários", true, true, true, true);
        cadastroUsuarioFrame.setSize(400, 300);
        cadastroUsuarioFrame.setVisible(true);

        // Adicionar o painel de cadastro dentro do JInternalFrame
        CadastroUsuario cadastroUsuarioPanel = new CadastroUsuario();
        cadastroUsuarioFrame.add(cadastroUsuarioPanel);

        // Adicionar o JInternalFrame ao desktopPane
        desktopPane.add(cadastroUsuarioFrame);
        try {
            cadastroUsuarioFrame.setSelected(true); // Definir o frame como ativo
        } catch (java.beans.PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }

    private void abrirCadastroPessoa() {
        for (JInternalFrame frame : desktopPane.getAllFrames()) {
            frame.dispose();
        }
        JInternalFrame cadastroPessoaFrame = new JInternalFrame("Cadastro de Pessoas", true, true, true, true);
        cadastroPessoaFrame.setSize(400, 300);
        cadastroPessoaFrame.setVisible(true);

        CadastroPessoa cadastroPessoaPanel = new CadastroPessoa();
        cadastroPessoaFrame.add(cadastroPessoaPanel);

        desktopPane.add(cadastroPessoaFrame);
        try {
            cadastroPessoaFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Inicializar a GUI
        SistemaPessoa frame = new SistemaPessoa();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
