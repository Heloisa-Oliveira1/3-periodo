public class Pessoa {
    // Atributos
    private String origem;
    private int idade;
    private String genero;
    private String cor;
    private String profissao;
 
    // Método construtor
    public Pessoa (String origem, int idade, String genero, String cor, String profissao) {
        this.origem = origem;
        this.idade = idade;
        this.genero = genero;
        this.cor = cor;
        this.profissao = profissao;
    }

    public String getOrigem(){
        return origem;
    }

    public int getIdade(){
        return idade;
    }

    public String getGenero(){
        return genero;
    }

    public String getCor(){
        return cor;
    }

    public String getProfissao(){
        return profissao;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setProfissão(String profissao){
        this.profissao = profissao;
    }
}