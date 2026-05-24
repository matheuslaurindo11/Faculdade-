package javacore.Bintroducaometodos.dominio.Csobrecagametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;

    private String genero;
    public int episodios;
    private String estudio;

    public Anime(String nome, String tipo, int episodios,String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int episodios,String genero, String estudio){
        this(nome,tipo,episodios,genero);
        this.estudio = estudio;

    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
        System.out.println("-------------------");
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




