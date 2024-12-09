package cdpo;

import javax.swing.*;

public final class CardapioView extends JFrame {
        private javax.swing.JButton btnConsultar;
        private javax.swing.JButton btnLimparCampos;
        private javax.swing.JButton btnVoltar;
        private javax.swing.JScrollPane jScrollPaneProdutos;
        private javax.swing.JLabel lblCodigo;
        private javax.swing.JPanel panelTela;
        private javax.swing.JTable tableProdutos;
        private javax.swing.JTextField txtCodigo;

        public CardapioView() {
                initComponents();
        }

        public void initComponents() {

                panelTela = new javax.swing.JPanel();
                btnConsultar = new javax.swing.JButton();
                btnVoltar = new javax.swing.JButton();
                txtCodigo = new javax.swing.JTextField();
                btnLimparCampos = new javax.swing.JButton();
                lblCodigo = new javax.swing.JLabel();
                jScrollPaneProdutos = new javax.swing.JScrollPane();
                tableProdutos = new javax.swing.JTable();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Cardapio ");

                panelTela.setBackground(new java.awt.Color(255, 255, 255));
                panelTela.setForeground(new java.awt.Color(255, 255, 255));
                panelTela.setPreferredSize(new java.awt.Dimension(400, 400));

                btnConsultar.setBackground(new java.awt.Color(51, 102, 255));
                btnConsultar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
                btnConsultar.setText("Consultar");
                btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnConsultar.addActionListener(this::btnConsultarActionPerformed);

                btnVoltar.setBackground(new java.awt.Color(255, 102, 102));
                btnVoltar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
                btnVoltar.setText("Voltar");
                btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnVoltar.addActionListener(this::btnVoltarActionPerformed);

                txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
                txtCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtCodigo.setForeground(new java.awt.Color(0, 0, 0));

                btnLimparCampos.setBackground(new java.awt.Color(51, 153, 255));
                btnLimparCampos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                btnLimparCampos.setForeground(new java.awt.Color(255, 255, 255));
                btnLimparCampos.setText("Limpar Campos");
                btnLimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnLimparCampos.addActionListener(this::btnLimparCamposActionPerformed);

                lblCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
                lblCodigo.setText("Consulte o produto ");

                tableProdutos.setBackground(new java.awt.Color(255, 255, 255));
                tableProdutos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null },
                                                { null, null, null },
                                                { null, null, null },
                                                { null, null, null }
                                },
                                new String[] {
                                                "Código", "Produto", "Valor"
                                }) {
                        boolean[] canEdit = new boolean[] {
                                        false, false, false
                        };

                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                tableProdutos.setShowGrid(true);
                jScrollPaneProdutos.setViewportView(tableProdutos);

                javax.swing.GroupLayout panelTelaLayout = new javax.swing.GroupLayout(panelTela);
                panelTela.setLayout(panelTelaLayout);
                panelTelaLayout.setHorizontalGroup(
                                panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelTelaLayout.createSequentialGroup()
                                                                .addGroup(panelTelaLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(panelTelaLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                panelTelaLayout.createSequentialGroup()
                                                                                                                                .addContainerGap()
                                                                                                                                .addComponent(btnConsultar)
                                                                                                                                .addGap(32, 32, 32)
                                                                                                                                .addComponent(btnVoltar))
                                                                                                .addGroup(panelTelaLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(26, 26, 26)
                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(txtCodigo)
                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGap(115, 115,
                                                                                                                                                                115)
                                                                                                                                                .addComponent(lblCodigo))
                                                                                                                                .addComponent(jScrollPaneProdutos,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                336,
                                                                                                                                                Short.MAX_VALUE))))
                                                                                .addGroup(panelTelaLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(btnLimparCampos)
                                                                                                .addGap(219, 219, 219)))
                                                                .addContainerGap(35, Short.MAX_VALUE)));
                panelTelaLayout.setVerticalGroup(
                                panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelTelaLayout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(lblCodigo)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtCodigo,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jScrollPaneProdutos,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                230,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)
                                                                .addGroup(
                                                                                panelTelaLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(btnConsultar)
                                                                                                .addComponent(btnLimparCampos)
                                                                                                .addComponent(btnVoltar))
                                                                .addContainerGap(47, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(panelTela,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                397,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(panelTela, javax.swing.GroupLayout.DEFAULT_SIZE, 436,
                                                                Short.MAX_VALUE));

                pack();
                setLocationRelativeTo(null);
        }

        private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {
                // logica da consulta de produtos
        }

        private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
                TelaNavegacaoView telaNav = new TelaNavegacaoView();
                telaNav.setVisible(true);
                dispose();
        }

        private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo.setText("");
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
                        java.util.logging.Logger.getLogger(CardapioView.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                java.awt.EventQueue.invokeLater(() -> {
                        new CardapioView().setVisible(true);
                });
        }

}
