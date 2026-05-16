package test;

import javacore.introducaoclasses.dominio.Estudante;
import javacore.introducaoclasses.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
    Estudante estudante1 = new Estudante();
    Estudante estudante2= new Estudante();
        estudante1.nome = "Matheus";
        estudante2.nome = "Maria";
        Estudante estudante = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante1.nome = "Matheus";
        estudante1.idade = 26;
        estudante1.sexo = "Masculino";


        estudante2.nome = "Maria";
         estudante2.idade = 22;
        estudante2.sexo = "Feminino";

        impressoraEstudante.ImprimeEstudante(estudante1);
        impressoraEstudante.ImprimeEstudante(estudante2);
        System.out.println("--------------------------");
        impressoraEstudante.ImprimeEstudante(estudante1);
        impressoraEstudante.ImprimeEstudante(estudante2);

         ///System.out.println(estudante1.idade);
         //System.out.println(estudante1.nome);
         // System.out.println(estudante1.sexo);
         //System.out.println("-----------------------------");
        //System.out.println(estudante2.idade);
        // System.out.println(estudante2.nome);
        //System.out.println(estudante2.sexo);
    }
}
