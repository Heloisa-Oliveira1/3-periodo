public class Lampada {
    private String marca; // Marca da lâmpada
    private String modelo; // Modelo da lâmpada
    private double potencia; // Potência da lâmpada em watts
    private boolean ligada; // Estado da lâmpada (ligada ou desligada)

    // Construtor para inicializar a lâmpada com marca, modelo e potência
    public Lampada(String marca, String modelo, double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligada = false; // Inicialmente a lâmpada está desligada
        try {
            setPotencia(potencia); // Usar o setter para validar a potência
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Getter para a marca
    public String getMarca() {
        return marca;
    }

    // Getter para o modelo
    public String getModelo() {
        return modelo;
    }

    // Getter para a potência
    public double getPotencia() {
        return potencia;
    }

    // Getter para o estado da lâmpada
    public boolean isLigada() {
        return ligada;
    }

    // Setter para a potência com validação
    public void setPotencia(double potencia) {
        if (potencia > 100) {
            this.potencia = potencia;
            this.ligada = false; // A lâmpada queima se a potência for maior que 100
            throw new IllegalArgumentException("A lâmpada " + marca + " (" + modelo + ") queimou devido à alta potência de " + potencia + " watts!");
        } else if (potencia <= 0) {
            throw new IllegalArgumentException("A lâmpada " + marca + " (" + modelo + ") tem uma potência inválida: " + potencia + " watts.");
        } else {
            this.potencia = potencia;
        }
    }

    // Método para ligar a lâmpada se a potência estiver dentro da faixa segura
    public void ligar() {
        if (potencia > 0 && potencia <= 100) {
            ligada = true;
            System.out.println("A lâmpada " + marca + " (" + modelo + ") está ligada com potência de " + potencia + " watts.");
        } else {
            System.out.println("Não é possível ligar a lâmpada " + marca + " (" + modelo + "). Potência de " + potencia + " watts fora da faixa segura.");
        }
    }

    // Método para desligar a lâmpada
    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("A lâmpada " + marca + " (" + modelo + ") está desligada.");
        } else {
            System.out.println("A lâmpada " + marca + " (" + modelo + ") já está desligada.");
        }
    }

    public static void main(String[] args) {
        // Testando a criação de lâmpadas com diferentes potências
        try {
            Lampada lampada1 = new Lampada("Philips", "LED-123", 150); // Potência alta
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar lâmpada: " + e.getMessage());
        }

        try {
            Lampada lampada2 = new Lampada("Osram", "Inc-456", 50);   // Potência segura
            lampada2.ligar();
            lampada2.desligar();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar lâmpada: " + e.getMessage());
        }

        try {
            Lampada lampada3 = new Lampada("GE", "Hal-789", 0);       // Potência inválida
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar lâmpada: " + e.getMessage());
        }
    }
}
