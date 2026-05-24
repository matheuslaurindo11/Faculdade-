package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeirafaixa = 9.70/ 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorDoImposto = 0;
        if(salarioAnual <= 34712){
            valorDoImposto = salarioAnual * primeirafaixa;
        }else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorDoImposto = salarioAnual * segundaFaixa;
        }else {
            valorDoImposto = salarioAnual * terceiraFaixa;

        } System.out.println(valorDoImposto);
    }
}
