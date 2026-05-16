package test;
import javacore.introducaoclasses.dominio.Jogador;
public class JogadorTest01{
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        System.out.println("Jogador:" + jogador.nome);
        System.out.println("time:" + jogador.time);
        System.out.println("idade:" + jogador.idade);
        System.out.println("Moraem: " + jogador.moraem);
        System.out.println("Cor do time: " + jogador.cordotime);
        System.out.println("Titulos:" + jogador.titulos);

    }
}
