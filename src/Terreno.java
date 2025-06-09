public class Terreno {
    private double largura;
    private double comprimento;
    private double valorMetroQuadrado;

    public Terreno(double largura, double comprimento, double valorMetroQuadrado) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.valorMetroQuadrado = valorMetroQuadrado;
    }

    // Esse aqui é o getters
    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getValorMetroQuadrado() {
        return valorMetroQuadrado;
    }

    // E esse o setters
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setValorMetroQuadrado(double valorMetroQuadrado) {
        this.valorMetroQuadrado = valorMetroQuadrado;
    }

    // Retonar o calculo da area
    public double calcularArea() {
        return largura * comprimento;
    }

    // Retornar o calculo do preco
    public double calcularPreco() {
        return calcularArea() * valorMetroQuadrado;
    }
}