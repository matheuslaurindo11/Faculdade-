package javacore.Eblocosinicializacao.domain;

//ORIGINAL
///ORIGINAL
public class Anime {

    private String nome;
    private static int[] episodios;
    //1 - Alocado espcaco em memoria
    //2 - Cada Atributo de classe e criada e inicializada com valores default ou o que for
    //3 - bloco de inicializacao e executado
    //4 - Construtor e executado

    //private int [] episodios = {1,2,3,4,5,6,7,8,9,10};
    static {
        System.out.println("Dentro construtor");
        System.out.println("Dentro do bloco statico");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
         {
            System.out.println("Dentro do bloco");
        }

        for (int episodios: Anime.episodios){
            System.out.println(episodios + " ");
        }
    }
}

