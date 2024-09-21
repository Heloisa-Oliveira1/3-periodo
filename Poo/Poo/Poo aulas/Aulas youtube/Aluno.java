public class Aluno {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        if(idade>0 && idade<130){
            this.idade = idade;
            System.out.println("Idade cadastrada!");
        }
        else {
            System.out.println("Erro! Idade invalida!");
        }
    }
}
