
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SistemaPessoa {

    private final String versaoSistema;
    private final String nomeUsuario;
    private final String dataAcesso;

    public SistemaPessoa(String versaoSistema, String nomeUsuario) {
        this.versaoSistema = versaoSistema;
        this.nomeUsuario = nomeUsuario;
        this.dataAcesso = obterDataAcesso();
    }

    public String getVersaoSistema() {
        return versaoSistema;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getDataAcesso() {
        return dataAcesso;
    }

    private String obterDataAcesso() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
        return dateFormat.format(new Date());
    }

    public void iniciarInterface() {
        JanelaSistemaPessoa janela = new JanelaSistemaPessoa(this);
        janela.configurarInterface();
    }
}
