package test;

import javacore.introducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("Nome " + carro.nome);
        System.out.println("Modelo " + carro.modelo);
        System.out.println("Cor " + carro.cor);
        System.out.println("Ano " + carro.ano);
        System.out.println("Tipo de Combustível " + carro.tipoCombustivel);
        System.out.println("-----");
        Carro carro2 = new Carro();
        carro2.nome = "Celta";
        carro2.modelo = "Sedan";
        carro2.cor = "Preto";

        System.out.println("Nome " + carro2.nome);
        System.out.println("Modelo " + carro2.modelo);
        System.out.println("Cor " + carro2.cor);




    }
}
