package javacore.bolo.domain.test;

import javacore.bolo.domain.domain.Bolo;

public class BoloTest01 {
    public static void main(String[] args) {
        Bolo bolo = new Bolo("Chocolate",10 + 10, "Doce de goiaba", "chocolate", "bolo" ,15 );
        Bolo bolo2 = new Bolo("Morango", 10 +30, "Doce de leite e morango ", "Morango", "BOLO", 15);
        Bolo bolo3 = new Bolo("Banana", 10 + 40, "Doce de banana", "Banana", "BOLO", 15);
        bolo.imprime();
        bolo2.imprime();
        bolo3.imprime();

    }
}
