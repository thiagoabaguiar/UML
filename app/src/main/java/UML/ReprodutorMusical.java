package UML;

public class ReprodutorMusical {

    private String musicaAtual;
    private String playList;
    private boolean isTocando;

    public ReprodutorMusical() {
    }

    public ReprodutorMusical(String musicaAtual, boolean isTocando) {
        this.musicaAtual = musicaAtual;
        this.isTocando = true;
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public boolean isIsTocando() {
        return isTocando;
    }

    public void setIsTocando(boolean isTocando) {
        this.isTocando = isTocando;
    }

    public void tocar(String musicaParaTocar) {
        this.musicaAtual = musicaParaTocar;
        this.isTocando = true;
    }

    public void pausar() {
        this.isTocando = false;
    }

    public void selecionarMusica(String musicaSelecionada) {
        this.musicaAtual = musicaSelecionada;
    }

}
