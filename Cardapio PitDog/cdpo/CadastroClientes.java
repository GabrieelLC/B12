package cdpo;

import javax.swing.*;

public final class CadastroClientes extends JFrame {
        private javax.swing.JButton btnCadastro;
        private javax.swing.JButton btnLimparCampos;
        private javax.swing.JButton btnVoltar;
        private javax.swing.JComboBox<String> cbxAutorizacao;
        private javax.swing.JComboBox<String> cbxSexo;
        private javax.swing.JLabel lblAutorizacao;
        private javax.swing.JLabel lblBairro;
        private javax.swing.JLabel lblCep;
        private javax.swing.JLabel lblCidade;
        private javax.swing.JLabel lblComplemento;
        private javax.swing.JLabel lblEmail;
        private javax.swing.JLabel lblEstado;
        private javax.swing.JLabel lblLogradouro;
        private javax.swing.JLabel lblNascimento;
        private javax.swing.JLabel lblNome;
        private javax.swing.JLabel lblNumero;
        private javax.swing.JLabel lblSexo;
        private javax.swing.JLabel lblTelefone;
        private javax.swing.JPanel panelTela;
        private javax.swing.JTextField txtBairro;
        private javax.swing.JFormattedTextField txtCep;
        private javax.swing.JTextField txtCidade;
        private javax.swing.JTextField txtComplemento;
        private javax.swing.JTextField txtEmail;
        private javax.swing.JTextField txtEstado;
        private javax.swing.JTextField txtLogradouro;
        private javax.swing.JFormattedTextField txtNascimento;
        private javax.swing.JTextField txtNome;
        private javax.swing.JTextField txtNumero;
        private javax.swing.JFormattedTextField txtTelefone;

        public CadastroClientes() {
                initComponents();
        }

        public void limparCampos() {
                txtBairro.setText("");
                txtCep.setText("");
                txtCidade.setText("");
                txtComplemento.setText("");
                txtEmail.setText("");
                txtEstado.setText("");
                txtLogradouro.setText("");
                txtNascimento.setText("");
                txtNome.setText("");
                txtNumero.setText("");
                txtTelefone.setText("");
        }

        public void initComponents() {
                panelTela = new javax.swing.JPanel();
                txtTelefone = new javax.swing.JFormattedTextField();
                btnCadastro = new javax.swing.JButton();
                btnVoltar = new javax.swing.JButton();
                lblNome = new javax.swing.JLabel();
                lblSexo = new javax.swing.JLabel();
                lblTelefone = new javax.swing.JLabel();
                txtNome = new javax.swing.JTextField();
                btnLimparCampos = new javax.swing.JButton();
                cbxSexo = new javax.swing.JComboBox<>();
                txtLogradouro = new javax.swing.JTextField();
                txtNumero = new javax.swing.JTextField();
                txtComplemento = new javax.swing.JTextField();
                txtBairro = new javax.swing.JTextField();
                txtCidade = new javax.swing.JTextField();
                txtEstado = new javax.swing.JTextField();
                txtCep = new javax.swing.JFormattedTextField();
                lblLogradouro = new javax.swing.JLabel();
                lblNumero = new javax.swing.JLabel();
                lblComplemento = new javax.swing.JLabel();
                lblBairro = new javax.swing.JLabel();
                lblCidade = new javax.swing.JLabel();
                lblEstado = new javax.swing.JLabel();
                lblCep = new javax.swing.JLabel();
                cbxAutorizacao = new javax.swing.JComboBox<>();
                lblAutorizacao = new javax.swing.JLabel();
                lblEmail = new javax.swing.JLabel();
                txtEmail = new javax.swing.JTextField();
                txtNascimento = new javax.swing.JFormattedTextField();
                lblNascimento = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Cadastro de Clientes");

                panelTela.setBackground(new java.awt.Color(255, 255, 255));
                panelTela.setForeground(new java.awt.Color(255, 255, 255));
                panelTela.setPreferredSize(new java.awt.Dimension(400, 400));

                txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
                txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
                try {
                        txtTelefone.setFormatterFactory(
                                        new javax.swing.text.DefaultFormatterFactory(
                                                        new javax.swing.text.MaskFormatter("(##) ####-####")));
                } catch (java.text.ParseException ex) {
                }
                txtTelefone.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

                btnCadastro.setBackground(new java.awt.Color(51, 102, 255));
                btnCadastro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
                btnCadastro.setText("Cadastrar");
                btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnCadastro.addActionListener(this::btnCadastroActionPerformed);

                btnVoltar.setBackground(new java.awt.Color(255, 102, 102));
                btnVoltar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
                btnVoltar.setText("Voltar");
                btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnVoltar.addActionListener(this::btnVoltarActionPerformed);

                lblNome.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblNome.setForeground(new java.awt.Color(0, 0, 0));
                lblNome.setText("Nome");

                lblSexo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblSexo.setForeground(new java.awt.Color(0, 0, 0));
                lblSexo.setText("Sexo");

                lblTelefone.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblTelefone.setForeground(new java.awt.Color(0, 0, 0));
                lblTelefone.setText("Telefone");

                txtNome.setBackground(new java.awt.Color(255, 255, 255));
                txtNome.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtNome.setForeground(new java.awt.Color(0, 0, 0));

                btnLimparCampos.setBackground(new java.awt.Color(51, 153, 255));
                btnLimparCampos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                btnLimparCampos.setForeground(new java.awt.Color(255, 255, 255));
                btnLimparCampos.setText("Limpar Campos");
                btnLimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnLimparCampos.addActionListener(this::btnLimparCamposActionPerformed);

                cbxSexo.setBackground(new java.awt.Color(255, 255, 255));
                cbxSexo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                cbxSexo.setForeground(new java.awt.Color(0, 0, 0));
                cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
                cbxSexo.setSelectedIndex(-1);

                txtLogradouro.setBackground(new java.awt.Color(255, 255, 255));
                txtLogradouro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtLogradouro.setForeground(new java.awt.Color(0, 0, 0));

                txtNumero.setBackground(new java.awt.Color(255, 255, 255));
                txtNumero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtNumero.setForeground(new java.awt.Color(0, 0, 0));

                txtComplemento.setBackground(new java.awt.Color(255, 255, 255));
                txtComplemento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtComplemento.setForeground(new java.awt.Color(0, 0, 0));

                txtBairro.setBackground(new java.awt.Color(255, 255, 255));
                txtBairro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtBairro.setForeground(new java.awt.Color(0, 0, 0));

                txtCidade.setBackground(new java.awt.Color(255, 255, 255));
                txtCidade.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtCidade.setForeground(new java.awt.Color(0, 0, 0));

                txtEstado.setBackground(new java.awt.Color(255, 255, 255));
                txtEstado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtEstado.setForeground(new java.awt.Color(0, 0, 0));

                txtCep.setBackground(new java.awt.Color(255, 255, 255));
                txtCep.setForeground(new java.awt.Color(0, 0, 0));
                try {
                        txtCep.setFormatterFactory(
                                        new javax.swing.text.DefaultFormatterFactory(
                                                        new javax.swing.text.MaskFormatter("#####-###")));
                } catch (java.text.ParseException ex) {
                }
                txtCep.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

                lblLogradouro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblLogradouro.setForeground(new java.awt.Color(0, 0, 0));
                lblLogradouro.setText("Logradouro");

                lblNumero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblNumero.setForeground(new java.awt.Color(0, 0, 0));
                lblNumero.setText("Número");

                lblComplemento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblComplemento.setForeground(new java.awt.Color(0, 0, 0));
                lblComplemento.setText("Complemento");

                lblBairro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblBairro.setForeground(new java.awt.Color(0, 0, 0));
                lblBairro.setText("Bairro");

                lblCidade.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblCidade.setForeground(new java.awt.Color(0, 0, 0));
                lblCidade.setText("Cidade");

                lblEstado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblEstado.setForeground(new java.awt.Color(0, 0, 0));
                lblEstado.setText("Estado");

                lblCep.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblCep.setForeground(new java.awt.Color(0, 0, 0));
                lblCep.setText("CEP");

                cbxAutorizacao.setBackground(new java.awt.Color(255, 255, 255));
                cbxAutorizacao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                cbxAutorizacao.setForeground(new java.awt.Color(0, 0, 0));
                cbxAutorizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIM", "NÃO" }));
                cbxAutorizacao.setSelectedIndex(-1);

                lblAutorizacao.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblAutorizacao.setForeground(new java.awt.Color(0, 0, 0));
                lblAutorizacao.setText("Autoriza receber mensagens por E-mail");

                lblEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblEmail.setForeground(new java.awt.Color(0, 0, 0));
                lblEmail.setText("E-mail");

                txtEmail.setBackground(new java.awt.Color(255, 255, 255));
                txtEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                txtEmail.setForeground(new java.awt.Color(0, 0, 0));

                txtNascimento.setBackground(new java.awt.Color(255, 255, 255));
                txtNascimento.setForeground(new java.awt.Color(0, 0, 0));
                txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                                new javax.swing.text.DateFormatter(
                                                java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
                txtNascimento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

                lblNascimento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
                lblNascimento.setForeground(new java.awt.Color(0, 0, 0));
                lblNascimento.setText("Nascimento");

                javax.swing.GroupLayout panelTelaLayout = new javax.swing.GroupLayout(panelTela);
                panelTela.setLayout(panelTelaLayout);
                panelTelaLayout.setHorizontalGroup(
                                panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelTelaLayout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addGroup(panelTelaLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(panelTelaLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(panelTelaLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                panelTelaLayout.createSequentialGroup()
                                                                                                                                                .addComponent(btnCadastro)
                                                                                                                                                .addGap(32, 32, 32)
                                                                                                                                                .addComponent(btnVoltar))
                                                                                                                .addComponent(btnLimparCampos)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                panelTelaLayout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                false)
                                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addComponent(txtNumero,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                103,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                                .addComponent(txtComplemento))
                                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addComponent(txtEstado,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                166,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                                .addComponent(txtCep))
                                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                .addComponent(cbxSexo,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                81,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(lblSexo))
                                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                panelTelaLayout
                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                lblTelefone)
                                                                                                                                                                                                                                .addGap(94,
                                                                                                                                                                                                                                                94,
                                                                                                                                                                                                                                                94))
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                txtTelefone,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                140,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                                                                .addComponent(txtLogradouro,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                336,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(lblLogradouro)
                                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addComponent(lblNumero)
                                                                                                                                                                                .addGap(65, 65, 65)
                                                                                                                                                                                .addComponent(lblComplemento))
                                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                .addComponent(txtBairro,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                157,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addComponent(lblBairro)
                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                lblEstado))
                                                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                panelTelaLayout
                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                                                panelTelaLayout
                                                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                lblCidade)
                                                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                                                txtCidade)))
                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                panelTelaLayout
                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                .addGap(21,
                                                                                                                                                                                                                                                21,
                                                                                                                                                                                                                                                21)
                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                lblCep)
                                                                                                                                                                                                                                .addGap(0,
                                                                                                                                                                                                                                                0,
                                                                                                                                                                                                                                                Short.MAX_VALUE)))))
                                                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(lblAutorizacao)
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addComponent(cbxAutorizacao,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                81,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addGroup(panelTelaLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(panelTelaLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(panelTelaLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(txtNome,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                336,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                panelTelaLayout.createSequentialGroup()
                                                                                                                                                .addComponent(txtEmail)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(txtNascimento,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                107,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(39, 39, 39))
                                                                                .addGroup(panelTelaLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(panelTelaLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(lblNome)
                                                                                                                .addComponent(lblEmail))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(lblNascimento)
                                                                                                .addGap(80, 80, 80)))));
                panelTelaLayout.setVerticalGroup(
                                panelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelTelaLayout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(lblNome)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(panelTelaLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(panelTelaLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(txtNome,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(panelTelaLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(lblEmail)
                                                                                                                .addComponent(lblNascimento))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(txtEmail,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(panelTelaLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                .addComponent(txtNascimento,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(panelTelaLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(panelTelaLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(lblSexo)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(cbxSexo,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(panelTelaLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(lblTelefone)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(txtTelefone,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(8, 8, 8)
                                                                .addComponent(lblLogradouro)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtLogradouro,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                panelTelaLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(lblNumero)
                                                                                                .addComponent(lblComplemento))
                                                                .addGap(4, 4, 4)
                                                                .addGroup(
                                                                                panelTelaLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(txtNumero,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txtComplemento,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(panelTelaLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblCidade)
                                                                                .addComponent(lblBairro))
                                                                .addGap(1, 1, 1)
                                                                .addGroup(
                                                                                panelTelaLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(txtBairro,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txtCidade,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(4, 4, 4)
                                                                .addGroup(
                                                                                panelTelaLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(lblEstado)
                                                                                                .addComponent(lblCep))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(
                                                                                panelTelaLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(txtEstado,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txtCep,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(
                                                                                panelTelaLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(lblAutorizacao)
                                                                                                .addComponent(cbxAutorizacao,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(30, 30, 30)
                                                                .addGroup(
                                                                                panelTelaLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(btnCadastro)
                                                                                                .addComponent(btnLimparCampos)
                                                                                                .addComponent(btnVoltar))
                                                                .addGap(48, 48, 48)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(panelTela, javax.swing.GroupLayout.DEFAULT_SIZE, 401,
                                                                Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(panelTela, javax.swing.GroupLayout.DEFAULT_SIZE, 494,
                                                                Short.MAX_VALUE));

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
                        java.util.logging.Logger.getLogger(CadastroClientes.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }

                java.awt.EventQueue.invokeLater(() -> {
                        new CadastroClientes().setVisible(true);
                });
        }

}
