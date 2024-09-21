public class testeAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        //aluno1.nome = "Fernanda";
        aluno1.setNome("Fernanda");

        System.out.println(aluno1.getNome());

        //aluno1.idade = 500;

        aluno1.setIdade(500);
    }
}
