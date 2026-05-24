package javacore.introducaoclasses.dominio;

public class Anime {
    private String nome;
    private String tipo;

    private String genero;
    public int episodios;

    private String Estudio;

    public Anime(String nome, String tipo, int episodios ,String genero){
        System.out.println("Dentro do Construtor");

        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(){
        System.out.println("Dentro do Construtor vazio");
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprime() {
        System.out.println("Nome " + nome);
        System.out.println(this.genero);
    }

    public void SetNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return this.nome;
    }

    public void SetTipo(String tipo) {
        this.tipo = tipo;
        System.out.println("Estilo" + tipo);
    }

    public void GetTipo(String nome) {
        System.out.println("Tipo" + nome);

    }

    public void SetEpisodios(int episodios) {
        this.episodios = episodios;
        System.out.println("Numero De Episodios " + episodios);

    }
    public int getEpisodios() {
        this.episodios = episodios;
        System.out.println("Numero De Episodios " + episodios);
        return episodios;
    }
}




