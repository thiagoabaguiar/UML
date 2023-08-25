package UML;

public class AparelhoTelefonico {

    private boolean isRecebendoChamada;
    private boolean isFazendoChamada;
    private double numeroLigacaoAtual;
    private boolean isMuted;

    public boolean isIsRecebendoChamada() {
        return isRecebendoChamada;
    }

    public void setIsRecebendoChamada(boolean isRecebendoChamada) {
        this.isRecebendoChamada = isRecebendoChamada;
    }

    public boolean isIsFazendoChamada() {
        return isFazendoChamada;
    }

    public void setIsFazendoChamada(boolean isFazendoChamada) {
        this.isFazendoChamada = isFazendoChamada;
    }

    public double getNumeroLigacaoAtual() {
        return numeroLigacaoAtual;
    }

    public void setNumeroLigacaoAtual(double numeroLigacaoAtual) {
        this.numeroLigacaoAtual = numeroLigacaoAtual;
    }

    public boolean isIsMuted() {
        return isMuted;
    }

    public void setIsMuted(boolean isMuted) {
        this.isMuted = isMuted;
    }

    public boolean ligar() {
        this.isFazendoChamada = true;
        return true;
    }

    public boolean atender(double recebendoChamadaDe) {
        this.numeroLigacaoAtual = recebendoChamadaDe;
        this.isRecebendoChamada = true;
        return true;
    }

    public void iniciarCorreioVoz() {
        System.out.println("Estas são suas mensagens...");
    }

}
