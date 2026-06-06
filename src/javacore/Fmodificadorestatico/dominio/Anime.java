package javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
                System.out.println("Dentro construtor");
        System.out.println("Dentro do bloco statico");

                episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

        for (int episodios : Anime.episodios) {
            System.out.println(episodios + "  ");
        }
    }
}

