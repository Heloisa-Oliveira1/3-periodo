// Definição da classe Car
public class Car {
    // Atributos da classe Car
    String marca;       // Marca do carro
    String model;       // Modelo do carro
    int year;           // Ano de fabricação do carro
    boolean isRunning;  // Indica se o carro está ligado ou desligado
    int velocidade;     // Velocidade atual do carro

    // Construtor da classe Car
    public Car(String marca, String model, int year) {
        this.marca = marca;         // Inicializa o atributo marca
        this.model = model;         // Inicializa o atributo model
        this.year = year;           // Inicializa o atributo year
        this.isRunning = false;     // Inicializa o atributo isRunning como falso (carro desligado)
        this.velocidade = 0;        // Inicializa o atributo velocidade como 0
    }

    // Método para ligar o carro
    public void start() {
        if (!isRunning) {   // Verifica se o carro não está ligado
            isRunning = true;   // Liga o carro
            System.out.println("O carro está ligado.");   // Mensagem indicando que o carro está ligado
        }
    }

    // Método para desligar o carro
    public void stop() {
        if (isRunning) {   // Verifica se o carro está ligado
            isRunning = false;   // Desliga o carro
            System.out.println("O carro está desligado.");   // Mensagem indicando que o carro está desligado
        }
    }

    // Método para dirigir o carro
    public void drive(int distance) {
        if (isRunning) {   // Verifica se o carro está ligado
            velocidade += distance;   // Incrementa a velocidade com a distância percorrida
            System.out.println("Dirigindo " + distance + " km.");   // Mensagem indicando a distância percorrida
        } else {
            System.out.println("O carro precisa estar ligado para dirigir.");   // Mensagem indicando que o carro precisa estar ligado
        }
    }

    // Método principal para testar a classe Car
    public static void main(String[] args) {
        // Cria uma instância da classe Car com marca "Marca", modelo "Modelo" e ano 2024
        Car carro = new Car("vw", "Fusca", 1945);
        // realisando o print da classe
        System.out.println("O " + carro.model + " foi definido e esta em " + carro.velocidade + " Km/h");

        carro.start();      // Liga o carro
        carro.drive(100);   // Dirige o carro por 100 km
        carro.stop();       // Desliga o carro
        
        // realizando o print da classe novamente
        System.out.println("O " + carro.model + " foi definido e esta em " + carro.velocidade + " Km/h");
    }
}
