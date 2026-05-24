package javacore.Bintroducaometodos.dominio.test;

import org.w3c.dom.ls.LSOutput;

public class Estudante {
    public String nome = "Matheus";
    public int idade;
    public char sexo;
    public void imprime(){
        System.out.println("---------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

    }
