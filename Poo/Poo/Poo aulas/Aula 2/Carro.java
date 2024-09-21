public class Carro {
    // atributos
    private String marca;
    private String modelo;
    private int ano;

    // Método construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para obter o modelo do carro
    public String getMarca() {
        return marca;
    }

    // Método para obter modelo do carro
    public String getModelo() {
        return modelo;
    }

    // Método para obter o ano do carro
    public int getAno() {
        return ano;
    }

    // definir a marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
