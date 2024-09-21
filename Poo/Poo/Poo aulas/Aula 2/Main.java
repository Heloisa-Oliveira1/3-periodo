public class Main {
    public static void main(String[] args) {
        // Criando o objeto Carro
        Carro meuCarro = new Carro("Fiat", "Uno com escada em cima", 2000);

        // Acessando os atributos do objeto meuCarro
        System.out.println("Carro "+ meuCarro.getMarca() + " "+ meuCarro.getModelo() + " " + meuCarro.getAno());
    }
}
