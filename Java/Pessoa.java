public class Pessoa {
    private String nome;
    private int idade;
    private String naturalidade;
    
    public Pessoa(String nome, int idade, String naturalidade) {
        this.nome = nome;
        this.idade = idade;
        this.naturalidade = naturalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }
    
    public String toString() {
        return nome + "," + idade + "," + naturalidade;
    }
}