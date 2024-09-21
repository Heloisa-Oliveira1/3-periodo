public class Lampada {
    String marca;
    String model;
    boolean isLigada;
    int voltagem;

    // Método construtor
    public Lampada(String marca, String model) {
        this.marca = marca;
        this.model = model;
        this.isLigada = false;
        this.voltagem = 0;
    }

    public void start() {
        // Método de ligar 
        if (!isLigada) {
            isLigada = true;
            System.out.println("A lampada esta ligada!");
        }
    }

    public void desligar() {
        // Desligando a luz
        if (isLigada) {
            isLigada = false;
            System.out.println("A lampada foi desligada!");
        }
    }

    public void drive(int potencia) {
        if (isLigada) {
            this.voltagem += potencia;
            System.out.println("A luz está em potencia "+potencia);
            System.out.println("A voltagem é: "+this.voltagem);
            if (potencia > 0) {
                System.out.println("A Luz esta ligada!");
            } if (potencia <= 100){
                System.out.println("A Luz esta ligada!");
            } else {
                System.out.println("A Luz queimou!");
            }
        } else {
            System.out.println("A lampada já está desligada");
        }
    }

    public static void main(String[] args) {
        Lampada luz = new Lampada("Luz", "Antiga");
        System.out.println("A lampada é "+luz.model);
        luz.drive(50);
        luz.start();
        luz.drive(2);
        luz.drive(200);
        luz.desligar();
    }
}