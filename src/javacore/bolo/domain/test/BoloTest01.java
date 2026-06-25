package javacore.bolo.domain.test;

import javacore.bolo.domain.domain.Bolo;

public class BoloTest01 {
    public static void main(String[] args) {
        Bolo bolo = new Bolo("Chocolate",10 + 10, "Doce De Goiaba", "Chocolate", "INFORMAÇÃO" ,3);
        Bolo bolo2 = new Bolo("Morango", 10 +30, "Doce De Leite e Morango ", "Morango", "INFORMAÇÃO",2);
        Bolo bolo3 = new Bolo("Banana", 10 + 40, "Doce De Banana", "Banana", "INFORMAÇÃO",3);
        bolo.imprime();
        bolo2.imprime();
        bolo3.imprime();

    }
}
