// Atributos
public class Carro {
    String marca;
    String model;
    int year;
    boolean isRunning;
    int velocidade;

    // método construtor
    public Carro(String marca, String model, int year) {
        this.marca = marca;
        this.model = model;
        this.year = year;
        this.isRunning = false;
        this.velocidade = 0;        
    }

    public void start() {
        // método de ligar o carro
        if (!isRunning) {
            isRunning = true;
            System.out.println("O carro esta ligado, VRUMMM!");
        }
    }

    public void stop() {
        // desligando o carro
        if (isRunning) {
            isRunning = false;
            System.out.println("O carro foi desligado!");
        }
    }

    public void drive(int distance) {
        if (isRunning) {
            this.velocidade += distance;
            System.out.println("O carro esta "+distance+" km/h");
            System.out.println("km é: "+this.velocidade);
        } else {
            System.out.println("O carro esta desligado, precisa ligar o carro primeiro, para acelerar!");
        }
    }

    public static void main(String[] args) {
        Carro car = new Carro("Fiat", "Uno", 2007);
        System.out.println("O carro foi criado é um: "+car.model);
        car.drive(250);
        car.start();
        car.drive(20);
        car.drive(50);
        car.drive(150);
        car.drive(40);
        car.drive(10);
        car.stop();
        car.drive(10);
    }
}
