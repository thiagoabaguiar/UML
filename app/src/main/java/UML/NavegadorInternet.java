package UML;

public class NavegadorInternet {

    private int qtdAbasAbertas;
    private String urlAbaAtual;
    private String urlAbasAbertas;

    public NavegadorInternet(String urlAbaAtual) {
        this.urlAbaAtual = urlAbaAtual;
    }

    public int getQtdAbasAbertas() {
        return qtdAbasAbertas;
    }

    public void setQtdAbasAbertas(int qtdAbasAbertas) {
        this.qtdAbasAbertas = qtdAbasAbertas;
    }

    public String getUrlAbaAtual() {
        return urlAbaAtual;
    }

    public void setUrlAbaAtual(String urlAbaAtual) {
        this.urlAbaAtual = urlAbaAtual;
    }

    public String getUrlAbasAbertas() {
        return urlAbasAbertas;
    }

    public void setUrlAbasAbertas(String urlAbasAbertas) {
        this.urlAbasAbertas = urlAbasAbertas;
    }

    public String exibirPagina() {
        return "Página Aberta";
    }

    public String adicionarNovaAba() {
        return "Nova aba aberta";
    }

    public boolean atualizarPagina(String urlPagina) {
        return true;
    }

}
