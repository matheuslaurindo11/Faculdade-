package javacore.Fmodificadorestatico.test;

import javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
       Carro carro1 = new Carro(" Bmw ", 250);
        Carro carro2 = new Carro(" Porsche " , 300);
        Carro carro3 = new Carro(" Fiat ",400);
        Carro.setVelocidadelimite(180);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
