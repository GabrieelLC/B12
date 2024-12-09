package cdpo;

import javax.swing.*;

public final class CadastroProdutos extends JFrame {
        private javax.swing.JButton btnCadastro;
        private javax.swing.JButton btnLimparCampos;
        private javax.swing.JButton btnVoltar;
        private javax.swing.JLabel lblCodigo;
        private javax.swing.JLabel lblDescricao;
        private javax.swing.JLabel lblPreco;
        private javax.swing.JPanel panelTela;
        private javax.swing.JTextField txtCodigo;
        private javax.swing.JTextField txtNomeProduto;
        private javax.swing.JFormattedTextField txtPreco;

        public CadastroProdutos() {
                initComponents();
        }

        public void limparCampos() {
                txtCodigo.setText("");
                txtNomeProduto.setText("");
                txtPreco.setText("");
        }

        public void initComponents() {

                panelTela = new javax.swing.JPanel();
                txtCodigo = new javax.swing.JTextField();
                txtNomeProduto = new javax.swing.JTextField();
                txtPreco = new javax.swing.JFormattedTextField();
                btnCadastro = new javax.swing.JButton();
                lblCodigo = new javax.swing.JLabel();
                lblDescricao = new javax.swing.JLabel();
                lblPreco = new javax.swing.JLabel();
                btnLimparCampos = new javax.swing.JButton();
                btnVoltar = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Cadastro de Produtos");
                setPreferredSize(new java.awt.Dimension(400, 500));

                panelTela.setBackground(new java.awt.Color(255, 255, 255));
                panelTela.setForeground(new java.awt.Color(255, 255, 255));
                panelTela.setPreferredSize(new java.awt.Dimension(400, 400));

                txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
                txtCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtCodigo.setForeground(new java.awt.Color(0, 0, 0));

                txtNomeProduto.setBackground(new java.awt.Color(255, 255, 255));
                txtNomeProduto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtNomeProduto.setForeground(new java.awt.Color(0, 0, 0));

                txtPreco.setBackground(new java.awt.Color(255, 255, 255));
                txtPreco.setForeground(new java.awt.Color(0, 0, 0));
                txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                                new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
                txtPreco.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

                btnCadastro.setBackground(new java.awt.Color(51, 102, 255));
                btnCadastro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
                btnCadastro.setText("Cadastrar");
                btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnCadastro.addActionListener(this::btnCadastroActionPerformed);

                lblCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
                lblCodigo.setText("Código");

                lblDescricao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblDescricao.setForeground(new java.awt.Color(0, 0, 0));
                lblDescricao.setText("Descrição");

                lblPreco.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblPreco.setForeground(new java.awt.Color(0, 0, 0));
                lblPreco.setText("Preço");

                btnLimparCampos.setBackground(new java.awt.Color(51, 153, 255));
                btnLimparCampos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                btnLimparCampos.setForeground(new java.awt.Color(255, 255, 255));
                btnLimparCampos.setText("Limpar Campos");
                btnLimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnLimparCampos.addActionListener(this::btnLimparCamposActionPerformed);

                btnVoltar.setBackground(new java.awt.Color(255, 102, 102));
                btnVoltar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
                btnVoltar.setText("Voltar");
                btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnVoltar.addActionListener(this::btnVoltarActionPerformed);

                javax.swing.GroupLayout panelTelaLayout = new javax.swing.GroupLayout(panelTela);
                panelTela.setLayout(panelTelaLayout);
                panelTelaLayout.setHorizontalGroup(
                                panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelTelaLayout.createSequentialGroup()
                                                                .addGroup(panelTelaLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(txtNomeProduto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                336,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(panelTelaLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                panelTelaLayout.createSequentialGroup()
                                                                                                                                .addContainerGap()
                                                                                                                                .addComponent(btnCadastro)
                                                                                                                                .addGap(32, 32, 32)
                                                                                                                                .addComponent(btnVoltar))
                                                                                                .addGroup(panelTelaLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(26, 26, 26)
                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addComponent(lblCodigo,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addComponent(lblPreco)
                                                                                                                                                                                .addGap(205, 205,
                                                                                                                                                                                                205)))
                                                                                                                                                .addGroup(
                                                                                                                                                                panelTelaLayout.createSequentialGroup()
                                                                                                                                                                                .addComponent(lblDescricao)
                                                                                                                                                                                .addGap(183, 183,
                                                                                                                                                                                                183)))
                                                                                                                                .addComponent(txtCodigo,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                336,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(panelTelaLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(btnLimparCampos)
                                                                                                .addComponent(txtPreco,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                336,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(38, Short.MAX_VALUE)));
                panelTelaLayout.setVerticalGroup(
                                panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelTelaLayout.createSequentialGroup()
                                                                .addGap(61, 61, 61)
                                                                .addComponent(lblCodigo)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtCodigo,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(lblDescricao)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtNomeProduto,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(46, 46, 46)
                                                                .addComponent(lblPreco)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtPreco,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(52, 52, 52)
                                                                .addGroup(
                                                                                panelTelaLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(btnCadastro)
                                                                                                .addComponent(btnLimparCampos)
                                                                                                .addComponent(btnVoltar))
                                                                .addContainerGap(53, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(panelTela, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(panelTela, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
                setLocationRelativeTo(null);
        }

        private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {
                // logica do cadastro de clientes
        }

        private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
                TelaNavegacaoView telaNav = new TelaNavegacaoView();
                telaNav.setVisible(true);
                dispose();
        }

        private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos();
        }

        public static void main(String args[]) {
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                                | javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(() -> {
                        new CadastroProdutos().setVisible(true);
                });
        }

}
