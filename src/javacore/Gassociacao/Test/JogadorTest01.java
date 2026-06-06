package javacore.Gassociacao.Test;

import javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar",27 );
        Jogador jogador2 = new Jogador("Kscerato", 20);
        Jogador jogador3 = new Jogador("Matheus",10);
        String tipo = "Atacante";
        System.out.println(tipo);
        Jogador [] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
            if(jogador.getNome() == "Neymar"){
                System.out.println("Jogador e o menino ney ");
            }

            if (jogador.getIdade() >= 18) {
                System.out.println(jogador.getNome() + " e um jogador de futebol");
            }
            else{
                System.out.println(jogador.getNome() + " nao e jogador por menor de idade ");
            }

        }


    }
}
