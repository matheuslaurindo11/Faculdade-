package javacore.bolo.domain.domain;

public class Bolo {
    public String nome;
    public String Tamanho;
    public String Sabor;
    public String recheio;
    public String ingredientes;

    public int [] fatias;
    public String tipo;
    public int tempo;
    public Bolo () {
        for (int fatias: fatias){
            System.out.println(fatias + "");

        }


    }



    public Bolo(String nome, int tempo, String ingredientes, String recheio, String tipo, int fatias) {
        this.nome = nome;
        this.tempo = tempo;
        this.recheio = recheio;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
        this.fatias = new int[3];


    }

    public void imprime(){
        System.out.println("---------------");
        System.out.println(this.nome);
        System.out.println(this.tempo);
        System.out.println(this.ingredientes);
        System.out.println(this.recheio);
        System.out.println(this.tipo);
        for (int i = 0; i < fatias.length; i++){
            fatias[i] = i + 0;

        }
        for (int fatias: this.fatias){
            System.out.println(fatias + " FATIAS");
        }
    }


    public String getNome() {
        System.out.println("getNome");
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getIngredientes() {
        return ingredientes;

    }


    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }


    }

