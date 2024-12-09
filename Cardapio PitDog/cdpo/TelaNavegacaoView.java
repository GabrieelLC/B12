package cdpo;

import javax.swing.*;

public final class TelaNavegacaoView extends JFrame {
    private javax.swing.JButton btnCadastroClientes;
    private javax.swing.JButton btnCadastroProdutos;
    private javax.swing.JButton btnCardapio;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JPanel panelTela;

    public TelaNavegacaoView() {
        initComponents();
    }

    public void initComponents() {
        panelTela = new javax.swing.JPanel();
        panelBotoes = new javax.swing.JPanel();
        btnCadastroProdutos = new javax.swing.JButton();
        btnCadastroClientes = new javax.swing.JButton();
        btnCardapio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Navegação");

        panelTela.setBackground(new java.awt.Color(255, 255, 255));
        panelTela.setForeground(new java.awt.Color(255, 255, 255));
        panelTela.setToolTipText("");
        panelTela.setPreferredSize(new java.awt.Dimension(400, 20));
        panelTela.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelTela, java.awt.BorderLayout.CENTER);
        panelTela.getAccessibleContext().setAccessibleName("");

        panelBotoes.setLayout(new java.awt.BorderLayout());
        panelBotoes.setLayout(new java.awt.GridLayout(3, 6));

        btnCadastroProdutos.setBackground(new java.awt.Color(51, 153, 255));
        btnCadastroProdutos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCadastroProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastroProdutos.setText("Cadastro de Produtos");
        btnCadastroProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastroProdutos.addActionListener(this::btnCadastroProdutosActionPerformed);
        panelBotoes.add(btnCadastroProdutos, java.awt.BorderLayout.CENTER);

        btnCadastroClientes.setBackground(new java.awt.Color(51, 153, 255));
        btnCadastroClientes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCadastroClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastroClientes.setText("Cadastro de Clientes");
        btnCadastroClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastroClientes.addActionListener(this::btnCadastroClientesActionPerformed);
        panelBotoes.add(btnCadastroClientes, java.awt.BorderLayout.CENTER);

        btnCardapio.setBackground(new java.awt.Color(51, 153, 255));
        btnCardapio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCardapio.setForeground(new java.awt.Color(255, 255, 255));
        btnCardapio.setText("Cardapio");
        btnCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCardapio.addActionListener(this::btnCardapioActionPerformed);
        panelBotoes.add(btnCardapio, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelBotoes, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }

    private void btnCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.setVisible(true);
        dispose();
    }

    private void btnCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {
        CadastroClientes cadastroClientes = new CadastroClientes();
        cadastroClientes.setVisible(true);
        dispose();
    }

    private void btnCardapioActionPerformed(java.awt.event.ActionEvent evt) {
        CardapioView cardapio = new CardapioView();
        cardapio.setVisible(true);
        dispose();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNavegacaoView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new TelaNavegacaoView().setVisible(true);
        });
    }

}
