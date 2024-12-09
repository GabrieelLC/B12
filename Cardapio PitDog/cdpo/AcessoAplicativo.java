package cdpo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcessoAplicativo {

    public static void main(String[] args) {
        // Criação do frame (janela)
        JFrame frame = new JFrame("Acesso ao aplicativo");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Criação dos componentes
        JLabel userLabel = new JLabel("Usuário:");
        userLabel.setBounds(10, 10, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(10, 40, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        frame.add(passwordText);

        // Ajustando a posição dos botões
        JButton confirmButton = new JButton("Confirmar");
        confirmButton.setBounds(110, 80, 100, 25); // Mover o botão "Confirmar" mais para a direita
        frame.add(confirmButton);

        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setBounds(10, 80, 90, 25); // O botão "Cancelar" permanece no mesmo lugar
        frame.add(cancelButton);

        // Ação do botão "Confirmar"
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());

                Autenticacao autenticacao = new Autenticacao();
                autenticacao.efetuarLogin(user, password);
            }
        });

        // Ação do botão "Cancelar"
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Fecha a janela
            }
        });

        // Centralizar a janela na tela
        frame.setLocationRelativeTo(null);

        // Tornar o frame visível
        frame.setVisible(true);
    }
}
