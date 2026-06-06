package javacore.bolo.domain.domain;

public class Bolo {
    public String nome;
    public String tamanho;
    public String sabor;
    public String recheio;
    public String ingredientes;

    public int [] fatias = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15} ;
    public String tipo;
    public int tempo;


    public Bolo(String nome, int tempo, String ingredientes, String recheio, String tipo,int fatias) {
        this.nome = nome;
        this.tempo = tempo;
        this.recheio = recheio;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
        this.fatias =  new int [fatias];

    }

    public void imprime(){
        System.out.println("---------------");
        System.out.println(this.nome);
        System.out.println(this.tempo);
        System.out.println(this.ingredientes);
        System.out.println(this.recheio);
        System.out.println(this.tipo);
        System.out.println(this.fatias);
        System.out.println("---------------");
        System.out.println();

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

