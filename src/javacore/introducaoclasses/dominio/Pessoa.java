package javacore.introducaoclasses.dominio;

public class Pessoa {
    private String nome;
    private int idade; {
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String nome){
        this.nome = nome;
        this.idade = 27;
    }
    public void Setidade(int idade){
        if(idade < 0){
            System.out.println("idade invalida");
            return;
        }
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}
