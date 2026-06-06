package javacore.Fmodificadorestatico.dominio;

public class Carro {
    public String Nome;
    private double velocidadeMaxima = 250;
    private static double velocidadelimite = 250;
    public Carro(String Nome,  double velocidadeMaxima) {
        this.Nome = Nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println();
        System.out.println("Nome" + this.Nome);
        System.out.println("VelocidadeLimite "  +this.velocidadelimite);
        System.out.println("Velocidade Maxima " + Carro.velocidadelimite);
    }
    public static void setVelocidadelimite(double velocidadelimite){
        Carro.velocidadelimite = velocidadelimite;
    }
    public static double getvelocidadelimite(){
        return Carro.velocidadelimite;
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }


    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        velocidadeMaxima = velocidadeMaxima;
    }
}
