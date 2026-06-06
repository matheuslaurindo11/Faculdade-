package javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private int idade;
    public void imprime(){
        System.out.println(this.nome);
    }

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
}
