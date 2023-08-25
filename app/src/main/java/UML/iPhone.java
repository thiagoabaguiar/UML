package UML;

public class iPhone implements Smartphone {

    private boolean isLigado;
    private int nivelBateria;
    private double memoriaLivre;

    public iPhone(boolean isLigado, int nivelBateria, double memoriaLivre) {
        this.nivelBateria = nivelBateria;
        this.memoriaLivre = memoriaLivre;
    }

    public boolean isIsLigado() {
        return isLigado;
    }

    public void setIsLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public double getMemoriaLivre() {
        return memoriaLivre;
    }

    public void setMemoriaLivre(double memoriaLivre) {
        this.memoriaLivre = memoriaLivre;
    }   
    
    @Override
    public void ligar() {
        this.isLigado = true;
    }

    @Override
    public void desligar() {
        this.isLigado = false;
    }
}
