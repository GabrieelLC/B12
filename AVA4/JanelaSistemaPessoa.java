
import java.awt.*;
import javax.swing.*;

public class JanelaSistemaPessoa {

    private SistemaPessoa sistemaPessoa;
    private JFrame janelaPrincipal;
    private JTextArea areaTrabalho;

    public JanelaSistemaPessoa(SistemaPessoa sistemaPessoa) {
        this.sistemaPessoa = sistemaPessoa;
        this.janelaPrincipal = new JFrame("Sistema Pessoa");
        this.areaTrabalho = new JTextArea();
    }

    public void configurarInterface() {
        configurarJanela();
        configurarMenu();
        configurarRodape();
        exibirJanela();
    }

    private void configurarJanela() {
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setSize(800, 800);
        janelaPrincipal.setLocationRelativeTo(null);
    }

    private void configurarMenu() {
        JMenuBar menuPrincipal = new JMenuBar();

        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");
        JMenu menuSair = new JMenu("Sair");

        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) {
                System.exit(0);
            }

            @Override
            public void menuDeselected(javax.swing.event.MenuEvent e) {
            }

            @Override
            public void menuCanceled(javax.swing.event.MenuEvent e) {
            }
        });

        menuCadastro.add(new JMenuItem("Usuários"));
        menuCadastro.add(new JMenuItem("Pessoas"));

        menuVisualizacao.add(new JMenuItem("Lista de usuários"));
        menuVisualizacao.add(new JMenuItem("Lista de pessoas"));

        menuPrincipal.add(menuCadastro);
        menuPrincipal.add(menuVisualizacao);
        menuPrincipal.add(menuSair);

        janelaPrincipal.getContentPane().add(BorderLayout.NORTH, menuPrincipal);
    }

    private void configurarRodape() {
        JPanel painelRodape = new JPanel();
        JLabel labelRodape = new JLabel(
                "Versão: " + sistemaPessoa.getVersaoSistema()
                + "   Usuário: " + sistemaPessoa.getNomeUsuario()
                + "   Data de acesso: " + sistemaPessoa.getDataAcesso()
        );

        painelRodape.add(labelRodape);
        janelaPrincipal.getContentPane().add(BorderLayout.SOUTH, painelRodape);
    }

    private void exibirJanela() {
        janelaPrincipal.getContentPane().add(BorderLayout.CENTER, areaTrabalho);
        janelaPrincipal.setVisible(true);
    }
}
