package javacore.introducaoclasses;

public class Estudante {
    public String nome;
    public int idade;
    public String sexo;

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Matheus";
        estudante.idade = 30;
        estudante.sexo = "M";
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);





    }
}
