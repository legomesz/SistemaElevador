public class Elevador {
    private int codigo;
    private int andarAtual;
    private int capacidadeMaxima;
    private int capacidadeAtual;
    
    public Elevador(int codigo, int andarAtual, int capacidadeMaxima) {
        this.codigo = codigo;
        this.andarAtual = andarAtual;
        this.capacidadeMaxima = capacidadeMaxima;
        this.capacidadeAtual = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }
}
