package cdpo;

import javax.swing.JOptionPane;

public class Autenticacao {

    // Torna as variáveis constantes (imutáveis)
    private final String password = "Teste@2024";
    private final String user = "denys.silva";

    public Autenticacao() {

    }

    // Método de autenticação utilizando os valores constantes
    public void efetuarLogin(String inputUser, String inputPassword) {
        if (user.equals(inputUser) && password.equals(inputPassword)) {
            JOptionPane.showMessageDialog(null, "Acesso confirmado!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
        }
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }
}
